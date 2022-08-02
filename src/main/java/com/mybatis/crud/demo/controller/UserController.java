package com.mybatis.crud.demo.controller;

import com.mybatis.crud.demo.entity.User;
import com.mybatis.crud.demo.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping("/user/find")
  public ResponseEntity<List<User>> getUserAll() {
    return ResponseEntity.ok(userService.getUserAll());
  }

  @PostMapping("/user/create")
  public ResponseEntity<String> inserUser(@RequestBody User user) {
    userService.createUser(user);

    return new ResponseEntity<>("insert success!", HttpStatus.OK);
  }

  @GetMapping("/user/find/{id}")
  public ResponseEntity<User> getUser(@PathVariable Long id) {
    User user = userService.getUser(id);
    return new ResponseEntity<>(user, HttpStatus.OK);
  }

  @PostMapping("/user/update/{id}")
  public ResponseEntity<String> getUser(@PathVariable Long id,@RequestBody User user) {
    int resultCode = userService.updateUser(id,user);
    if (resultCode != 1) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>("update success!", HttpStatus.OK);
  }
}

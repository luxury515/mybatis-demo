package com.mybatis.crud.demo.service;

import com.mybatis.crud.demo.entity.User;
import com.mybatis.crud.demo.mapper.user.UserMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

  private final UserMapper userMapper;

  public List<User> getUserAll() {
    return userMapper.findAll();
  }

  public User getUser(Long userId) {
    return userMapper.findById(userId);
  }

  public void createUser(User user) {
    userMapper.save(user);
  }

  public int updateUser(Long userId ,User user) {
    User findUser = userMapper.findById(userId);
    if (findUser == null) {
      return -1;
    }
    findUser.setUsername(user.getUsername());
    findUser.setEmail(user.getEmail());
    return userMapper.update(findUser);
  }
}

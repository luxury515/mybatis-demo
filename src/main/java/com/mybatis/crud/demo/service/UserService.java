package com.mybatis.crud.demo.service;

import com.mybatis.crud.demo.entity.User;
import com.mybatis.crud.demo.mapper.UserMapper;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.javassist.NotFoundException;
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

    public int createUser(User user) {
       return userMapper.save(user);
    }

    public int updateUser(User user) {
        User findUser = userMapper.findById(user.getId());
        if (findUser == null) {
            return -1;
        }
        return userMapper.update(user);
    }

}

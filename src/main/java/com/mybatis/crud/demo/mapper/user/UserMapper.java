package com.mybatis.crud.demo.mapper.user;

import com.mybatis.crud.demo.entity.User;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {


//    @Select("""
//        SELECT * FROM `mybatis_db`.`user`
//        """)
    List<User> findAll();


//    @Select("""
//        SELECT * FROM `mybatis_db`.`user` WHERE id = #{id}
//        """)
    User findById(@Param("id") Long id);

//    @Insert("""
//        INSERT INTO `mybatis_db`.`user` (username,email) VALUES (#{username},#{email})
//        """)
    void save(User user);

//    @Update("""
//        UPDATE `mybatis_db`.`user` SET username=#{username} , email=#{email} WHERE id = #{id}
//        """)
    int update(User user);
}

package com.mybatis.crud.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringCrudMybatisMariadbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudMybatisMariadbApplication.class, args);
    }

}

package com.liuhongyin.mybatislearn;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
@MapperScan("com.liuhongyin.mybatislearn.mapper")
public class MybatisLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisLearnApplication.class, args);
    }

}

package com.qtwy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.qtwy.dao")
public class QtwyYzdApplication {

    public static void main(String[] args) {
        SpringApplication.run(QtwyYzdApplication.class, args);
    }

}

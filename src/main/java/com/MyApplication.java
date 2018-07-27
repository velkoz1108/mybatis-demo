package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@EnableAutoConfiguration
public class MyApplication implements WebMvcConfigurer {


    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}

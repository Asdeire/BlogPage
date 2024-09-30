package com.asdeire.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BlogAppApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BlogAppApplication.class, args);
    }
}

package com.example.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    public void sayHi(String name) {
        System.out.println("Hi, Configuration " + name);
    }
}

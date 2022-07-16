package com.example.util;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void sayHi(String name) {
        System.out.println("Hi, Service " + name);
    }
}

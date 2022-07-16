package com.example.component;

import org.springframework.stereotype.Component;

@Component
public class UserComponent {
    public void sayHi(String name) {
        System.out.println("Hi Component " + name);
    }
}

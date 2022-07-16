package com.example.controller;

import org.springframework.stereotype.Controller;

@Controller // 将当前的类注册到Spring中
public class UserController {
    /**
     * 对象中的测试方法
     * @param name
     */

    public void sayHi(String name) {
        System.out.println("Hi, Controller " + name);
    }
}

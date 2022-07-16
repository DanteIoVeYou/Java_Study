package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository // 将当前对象存储到Spring中
public class UserRepository {
    public void sayHi(String name) {
        System.out.println("Hi Repository " + name);
    }
}

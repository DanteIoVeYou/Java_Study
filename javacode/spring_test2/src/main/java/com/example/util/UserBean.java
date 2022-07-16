package com.example.util;

import com.example.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserBean {
    @Bean // 将当前对象存储到Spring当中
    public User user1() {
        User user = new User();
        user.setAge(19);
        user.setId(20200000);
        user.setName("zhangsan");
        return user;
    }
    @Bean(name = {"u2"})
    public User user2() {
        User user = new User();
        user.setAge(20);
        user.setId(20200000);
        user.setName("lisi");
        return user;
    }
}

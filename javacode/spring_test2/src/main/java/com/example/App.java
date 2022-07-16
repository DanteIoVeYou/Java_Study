package com.example;

import com.example.Model.User;
import com.example.component.UserComponent;
import com.example.config.UserConfiguration;
import com.example.controller.UserController;
import com.example.dao.UserRepository;
import com.example.util.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring启动类
 */
public class App {
    public static void main(String[] args) {
//        // 1.先获取对象的
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        // 2.从Spring中获得注入的对象(id默认的规则是将存入的类首字母小写)
//        UserController userController = context.getBean("userController"    , UserController.class);
//        // 3.使用对象
//        userController.sayHi("Java");
//
//        UserService userService = context.getBean("userService", UserService.class);
//        userService.sayHi("Service!!!");
//
//        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
//        userRepository.sayHi("MySQL!!!");
//
//        UserConfiguration userConfiguration = context.getBean("userConfiguration", UserConfiguration.class);
//        userConfiguration.sayHi("Spring");
//
//        UserComponent userComponent = context.getBean("userComponent", UserComponent.class);
//        userComponent.sayHi("SpringBoot");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user1", User.class);
        System.out.println(user);
    }
}

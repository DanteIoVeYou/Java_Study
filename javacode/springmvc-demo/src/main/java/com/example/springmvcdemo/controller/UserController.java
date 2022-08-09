package com.example.springmvcdemo.controller;

import com.example.springmvcdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/1")
@ResponseBody
public class UserController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public Object sayHi(String name) {
        return "Hello SpringMVC" + name;
    }

    @PostMapping(value = "post-type")
    public Object testPost() {
        return "test Post";
    }

    @GetMapping(value = "reg")
    public Object reg(String name, Integer age) {
        return "register " + name + " age " + age;
    }

    @RequestMapping(value = "reg2")
    public Object reg2(@RequestBody User user) {
        return user;
    }

    @GetMapping(value = "time")
    public Object setTime(@RequestParam(value = "time", required = false) String createtime) {
        // 省略...
        return "time: " + createtime;
    }

    @PostMapping(value = "/p/{name}/{age}")
    public Object urlParam(@PathVariable String name, @PathVariable Integer age) {
        return "name: " + name + " age: " + age;
    }

    @RequestMapping(value = "/file")
    public Object upload(@RequestPart("myfile")MultipartFile file) throws IOException {
//        保存文件
//        1. 上传文件的目录
//        2. 生成动态的文件名(包含后缀)
        file.transferTo(new File("D:\\logs\\test.jpg"));
        return "success";
    }

}

package com.example.demo.Controller;

import com.example.demo.Service.StuService;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiaogu
 * @date 2021/4/16 12:05
 **/
@RestController
@RequestMapping("/api/stu")
public class StuController {
    @Autowired
    StuService stuService;   //注入注解
    /**
     * 列出所有学生信息
     */
    @GetMapping("/listall")//接受GET请求
    public List<Student> listall(){
        return stuService.listall();
    }

    @GetMapping("hello")
    public String hello(String str){
        return "Hello, "+str;
    }
}

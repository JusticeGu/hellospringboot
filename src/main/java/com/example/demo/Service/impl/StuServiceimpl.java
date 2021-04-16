package com.example.demo.Service.impl;

import com.example.demo.DAO.StuDao;
import com.example.demo.Service.StuService;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaogu
 * @date 2021/4/16 12:03
 **/
@Service  //声明Service
public class StuServiceimpl implements StuService {
    @Autowired //注入注解
    StuDao stuDao;
    @Override
    public List<Student> listall() {
        return stuDao.findAll();//jpa官方提供的方法，可以直接调用无需自己实现
    }

    @Override
    public List<Student> listbyclass(int classid) {
        return null;
    }
}

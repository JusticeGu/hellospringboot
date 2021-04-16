package com.example.demo.Service;

import com.example.demo.entity.Student;

import java.util.List;

/**
 * @author xiaogu
 * @date 2021/4/16 12:02
 **/
public interface StuService {
    public List<Student> listall();
    public List<Student> listbyclass(int classid);
}

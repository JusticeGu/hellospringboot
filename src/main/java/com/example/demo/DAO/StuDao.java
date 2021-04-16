package com.example.demo.DAO;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiaogu
 * @date 2021/4/16 12:01
 **/
public interface StuDao extends JpaRepository<Student,Long> {
}

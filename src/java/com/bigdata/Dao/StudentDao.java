/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.Dao;

import com.bigdata.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suresh
 */
public class StudentDao {

    private List<Student> stdList = new ArrayList<>();

    public StudentDao() {
        stdList.add(new Student(111, "bijaya", "bij@gmail.com"));
        stdList.add(new Student(222, "suresh", "suresh@yahoomail.com"));
        stdList.add(new Student(333, "roshan", "ro@hotmail.com"));

    }

    public List<Student> getAllStudent() {
        return stdList;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.springexample.DAO.Impl;

import com.neupane.springexample.DAO.StudentDAO;
import com.neupane.springexample.entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author parlad
 */

@Repository(value = "studentDAO")
public class StudentDAOImpl implements StudentDAO {

    private List<Student> studentList = new ArrayList<>();

    public StudentDAOImpl() {
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public int insert(Student a) {
        studentList.add(a);
        return 1;
    }

    @Override
    public Student getById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

}

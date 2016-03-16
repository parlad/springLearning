/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.springexample.DAO;

import com.neupane.springexample.entity.Student;
import java.util.List;

/**
 *
 * @author parlad
 */
public interface StudentDAO {

    List<Student> getAll();

    int insert(Student a);

    Student getById(int id);
}

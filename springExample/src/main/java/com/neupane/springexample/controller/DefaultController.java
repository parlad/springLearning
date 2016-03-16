/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.springexample.controller;

import com.neupane.springexample.DAO.StudentDAO;
import com.neupane.springexample.entity.Student;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author parlad
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) {
        loadStudent();
        map.addAttribute("students", studentDAO.getAll());
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)

    public String indexPost(ModelMap map) {
        Student assign = new Student();
        return null;
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    @ResponseBody
    public String about() {
        return "<h1>About Us</h1>";
    }

    private void loadStudent() {
        studentDAO.insert(new Student(1, "parlad", "banasthali", "12131", "parlad@gmail.com"));
    }
}

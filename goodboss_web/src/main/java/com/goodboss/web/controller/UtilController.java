package com.goodboss.web.controller;


import com.goodboss.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/util")
public class UtilController {
    @Autowired
    private EmployeeService employeeService;

}

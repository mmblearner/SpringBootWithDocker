package com.mukesh.springbootwithdocker.web;

import com.mukesh.springbootwithdocker.dto.Employee;
import com.mukesh.springbootwithdocker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mukesh Bhoge
 **/
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/getEmployeeDetails",produces = "application/json")
    @ResponseBody
    public Employee getEmployeeDetails() {
        //return new ResponseEntity<>(employeeService.getEmployeeDetails(), HttpStatus.OK);
        System.out.println("!! Get Employee Details !!");
        return employeeService.getEmployeeDetails();
    }
}

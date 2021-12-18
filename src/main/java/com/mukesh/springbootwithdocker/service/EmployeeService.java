package com.mukesh.springbootwithdocker.service;


import com.mukesh.springbootwithdocker.dto.Employee;
import org.springframework.stereotype.Service;

/**
 * @author Mukesh Bhoge
 **/
public interface EmployeeService {

    Employee getEmployeeDetails();

}

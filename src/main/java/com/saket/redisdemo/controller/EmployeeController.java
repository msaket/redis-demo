package com.saket.redisdemo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saket.redisdemo.service.EmployeeService;
import com.saket.redisdemo.vo.EmployeeVO;

@RestController()
@RequestMapping("/employee")
public class EmployeeController {

	@Resource EmployeeService empService;
	

	@GetMapping("/get/{empId}")
	public EmployeeVO getEmp(@PathVariable String empId) {
		System.out.println("Rest Get" + empId);
		return empService.getEmployee(empId);
	}
	
	@GetMapping("/test")
	public EmployeeVO getEmp() {
		System.out.println("Rest Test");
		return empService.getEmployee("12345");
	}

}

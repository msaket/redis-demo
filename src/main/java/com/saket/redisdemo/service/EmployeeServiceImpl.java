package com.saket.redisdemo.service;

import java.util.NoSuchElementException;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.saket.redisdemo.repository.EmployeeRepository;
import com.saket.redisdemo.vo.EmployeeVO;

@Service("empService")
@CacheConfig(cacheNames = {"emp-cache"})
public class EmployeeServiceImpl implements EmployeeService {
	
	@Resource EmployeeRepository empRepository;
	
	@Cacheable(key = "#empId")
	public EmployeeVO getEmployee(String empId) {
		System.out.println("Start Service getEmployee");
		EmployeeVO emp = null;
		
		try {
			emp = empRepository.findById(empId).get();
			System.out.println("FOUND in CACHE===================");
		} catch (NoSuchElementException ex) {
			emp = new EmployeeVO();
			emp.setEmpId(empId);
			emp.setEmpName("Test");
			System.out.println("ADDING TO CACHE******************========");	
			empRepository.save(emp);
		}
		
		return emp;
	}

}

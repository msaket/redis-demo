package com.saket.redisdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.saket.redisdemo.vo.EmployeeVO;

public interface EmployeeRepository extends CrudRepository<EmployeeVO, String>{

}

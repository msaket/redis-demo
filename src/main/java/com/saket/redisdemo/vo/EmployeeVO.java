package com.saket.redisdemo.vo;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Employee")
public class EmployeeVO implements Serializable {

	private static final long serialVersionUID = 7145031173942947889L;
	
	@Id
	private String empId;
	
	private String empName;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}

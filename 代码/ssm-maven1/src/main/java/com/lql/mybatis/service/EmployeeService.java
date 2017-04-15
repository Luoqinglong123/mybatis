package com.lql.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lql.mybatis.dao.EmployeeMapper;
import com.lql.mybatis.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	/*@Autowired
	private SqlSession sqlSession;*/

	public List<Employee> getEmps() {
		//EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		return employeeMapper.getEmps();
	}

}

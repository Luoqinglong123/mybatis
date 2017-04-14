package com.atguigu.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public Employee getEmpByIdAndName(@Param("id")Integer id,@Param("name")String name);
	
	public List<Employee> getEmpByDynamic(Employee employee);
	
}

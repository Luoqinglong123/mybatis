package com.atguigu.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import com.atguigu.mybatis.bean.Employee;

public interface EmployeeAnnotation {
	@Select("select * from tb_employee where id = #{id}")
	public Employee getEmpById(Integer id);
}

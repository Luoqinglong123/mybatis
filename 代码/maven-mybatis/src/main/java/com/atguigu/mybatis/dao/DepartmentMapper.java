package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Department;

public interface DepartmentMapper {
	public Department getDeptById(Integer id);
	
	public Department getDeptAndEmp(Integer id);
	
	
}

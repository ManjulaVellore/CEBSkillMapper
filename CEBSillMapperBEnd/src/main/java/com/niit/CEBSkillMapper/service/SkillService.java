package com.niit.CEBSkillMapper.service;

import java.util.List;


import com.niit.CEBSkillMapper.model.Skills;


public interface SkillService {
	public boolean add(Skills skill);
	public boolean delete(int employeeid);
	public boolean update(Skills employee);
	public Skills getUpdateId(int employeeid);
	List<Skills> getAllSkills();// view all records
	public Skills getEmployeebyId(int employeeid);
	//List<Skills> SearchSkills(String keywords);
}

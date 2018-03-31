package com.qxg.dao.rpc;

import java.util.List;

import com.qxg.model.rpc.*;

public interface CourseDaoRpc {
	//课程列表
	List<Course> getAllCourse();

	//新增课程
	int insert(Course course);

	
	int insertSelective(Course record);
	
	//删除课程
	int delete(Integer id);
	
	//课程详情
	Course getCourseInfo(Integer id);
	
	int updateSave(Course course);

}

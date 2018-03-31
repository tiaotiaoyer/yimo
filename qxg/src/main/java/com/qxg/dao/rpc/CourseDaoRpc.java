package com.qxg.dao.rpc;

import java.util.List;

import com.qxg.model.rpc.*;

public interface CourseDaoRpc {
	//�γ��б�
	List<Course> getAllCourse();

	//�����γ�
	int insert(Course course);

	
	int insertSelective(Course record);
	
	//ɾ���γ�
	int delete(Integer id);
	
	//�γ�����
	Course getCourseInfo(Integer id);
	
	int updateSave(Course course);

}

package com.qxg.intf.rpc;

import java.util.List;

import com.qxg.model.rpc.*;

public interface CourseServiceRpc {
	// �γ��б�
	List<Course> getAllCourse();

	// �����γ�
	int insert(Course course);

	// ɾ���γ�
	int delete(Integer id);

	// �γ�����
	Course getCourseInfo(Integer id);
	
	int updateSave(Course course);
}

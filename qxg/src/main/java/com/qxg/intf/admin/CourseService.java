package com.qxg.intf.admin;

import java.util.List;

import com.qxg.model.admin.*;

public interface CourseService {
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

package com.qxg.service.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qxg.dao.admin.CourseDao;
import com.qxg.intf.admin.CourseService;
import com.qxg.model.admin.*;

@Service
public class CourseServiceImpl implements CourseService{

	@Resource
	private CourseDao courseDao;
	
	/**
	 * �γ��б�
	 */
	public List<Course> getAllCourse() {
		 return courseDao.getAllCourse();
	}


	/**
	 * �����γ�
	 */
	public int insert(Course course) {
		return courseDao.insert(course);
	}


	/**
	 * ɾ���γ�
	 */
	public int delete(Integer id) {
		return courseDao.delete(id);
	}


	/**
	 * �γ�����
	 */
	public Course getCourseInfo(Integer id) {
		return courseDao.getCourseInfo(id);
	}


	public int updateSave(Course course) {
		return courseDao.updateSave(course);
	}

}

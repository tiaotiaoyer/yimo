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
	 * 课程列表
	 */
	public List<Course> getAllCourse() {
		 return courseDao.getAllCourse();
	}


	/**
	 * 新增课程
	 */
	public int insert(Course course) {
		return courseDao.insert(course);
	}


	/**
	 * 删除课程
	 */
	public int delete(Integer id) {
		return courseDao.delete(id);
	}


	/**
	 * 课程详情
	 */
	public Course getCourseInfo(Integer id) {
		return courseDao.getCourseInfo(id);
	}


	public int updateSave(Course course) {
		return courseDao.updateSave(course);
	}

}

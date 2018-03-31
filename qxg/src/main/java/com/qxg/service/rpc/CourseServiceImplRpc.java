package com.qxg.service.rpc;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qxg.dao.rpc.CourseDaoRpc;
import com.qxg.intf.rpc.CourseServiceRpc;
import com.qxg.model.rpc.*;

@Service
public class CourseServiceImplRpc implements CourseServiceRpc{

	@Resource
	private CourseDaoRpc courseDaoRpc;
	
	/**
	 * 课程列表
	 */
	public List<Course> getAllCourse() {
		 return courseDaoRpc.getAllCourse();
	}


	/**
	 * 新增课程
	 */
	public int insert(Course course) {
		return courseDaoRpc.insert(course);
	}


	/**
	 * 删除课程
	 */
	public int delete(Integer id) {
		return courseDaoRpc.delete(id);
	}


	/**
	 * 课程详情
	 */
	public Course getCourseInfo(Integer id) {
		return courseDaoRpc.getCourseInfo(id);
	}


	public int updateSave(Course course) {
		return courseDaoRpc.updateSave(course);
	}

}

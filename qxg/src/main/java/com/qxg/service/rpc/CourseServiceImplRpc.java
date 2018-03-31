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
	 * �γ��б�
	 */
	public List<Course> getAllCourse() {
		 return courseDaoRpc.getAllCourse();
	}


	/**
	 * �����γ�
	 */
	public int insert(Course course) {
		return courseDaoRpc.insert(course);
	}


	/**
	 * ɾ���γ�
	 */
	public int delete(Integer id) {
		return courseDaoRpc.delete(id);
	}


	/**
	 * �γ�����
	 */
	public Course getCourseInfo(Integer id) {
		return courseDaoRpc.getCourseInfo(id);
	}


	public int updateSave(Course course) {
		return courseDaoRpc.updateSave(course);
	}

}

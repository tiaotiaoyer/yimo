package com.qxg.controller.rpc;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qxg.intf.rpc.CourseServiceRpc;
import com.qxg.model.rpc.*;

@Controller
@RequestMapping("/courseRpc")
public class CourseControllerRpc {
	@Resource
	private CourseServiceRpc courseServiceRpc;

	/**
	 * 课程列表
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView getAllCourse(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("course-list");
		List<Course> courses = courseServiceRpc.getAllCourse();
		System.out.println(courses);
		for (Course cou : courses) {
			System.out.println(cou.getCname());
		}
		mav.addObject("courses", courses);
		return mav;
	}

	/**
     * 添加课程
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/add") 
    public ModelAndView addCourse() {
        ModelAndView mav = new ModelAndView("course-edit"); 
        return mav;  
    }
    
    /**
     * 保存课程
     * @param course 课程信息
     * @return
     */
    @RequestMapping("/save") 
    public ModelAndView saveCourse(Course course) {
        ModelAndView mav = new ModelAndView("course-list"); 
        courseServiceRpc.insert(course);
        List<Course> courses = courseServiceRpc.getAllCourse(); 
        mav.addObject("courses", courses); 
        return mav;  
    }
    
    /**
     * 删除课程
     * @param id 课程id
     * @return
     */
    @RequestMapping("/delete") 
    public ModelAndView deleteCourse(Integer id) {
    	courseServiceRpc.delete(id);
        ModelAndView mav = new ModelAndView("course-list"); 
        List<Course> courses = courseServiceRpc.getAllCourse(); 
        mav.addObject("courses", courses); 
        return mav;  
    }
    
    /**
     * 查看课程详情
     * @param request
     * @param model
     * @param id 课程id
     * @return
     */
    @RequestMapping("/detail") 
    public ModelAndView getCourseDetail(Integer id) {
        ModelAndView mav = new ModelAndView("course-detail"); 
         Course course = courseServiceRpc.getCourseInfo(id); 
         System.out.println(course);
         mav.addObject("course", course); 
        return mav;  
    }

    /**
     * 修改课程
     * @param request
     * @param model
     * @param id 课程id
     * @return
     */
    @RequestMapping("/update") 
    public ModelAndView updateCourse(Integer id) {
        ModelAndView mav = new ModelAndView("course-modify"); 
         Course course = courseServiceRpc.getCourseInfo(id); 
         System.out.println(course);
         mav.addObject("course", course); 
        return mav;  
    }
    
    @RequestMapping("/updateSave") 
    public ModelAndView updateSave(Course course) {
        ModelAndView mav = new ModelAndView("course-list"); 
        courseServiceRpc.updateSave(course);
        List<Course> courses = courseServiceRpc.getAllCourse(); 
        mav.addObject("courses", courses); 
        return mav;  
    }

}

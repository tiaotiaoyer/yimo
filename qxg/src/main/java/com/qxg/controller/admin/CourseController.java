package com.qxg.controller.admin;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qxg.intf.admin.CourseService;
import com.qxg.model.admin.*;

@Controller
@RequestMapping("/course")
public class CourseController {
	@Resource
	private CourseService courseService;

	/**
	 * 课程列 1 2 dr 表
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView getAllCourse(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("course-list");
		List<Course> courses = courseService.getAllCourse();
		System.out.println(courses);
		for (Course cou : courses) {
			System.out.println(cou.getCname());
		}
		mav.addObject("1courses", courses);
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
        courseService.insert(course);
        List<Course> courses = courseService.getAllCourse(); 
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
        courseService.delete(id);
        ModelAndView mav = new ModelAndView("course-list"); 
        List<Course> courses = courseService.getAllCourse(); 
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
         Course course = courseService.getCourseInfo(id); 
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
         Course course = courseService.getCourseInfo(id); 
         System.out.println(course);
         mav.addObject("course", course); 
        return mav;  
    }
    
    @RequestMapping("/updateSave") 
    public ModelAndView updateSave(Course course) {
        ModelAndView mav = new ModelAndView("course-list"); 
        courseService.updateSave(course);
        List<Course> courses = courseService.getAllCourse(); 
        mav.addObject("courses", courses); 
        return mav;  
    }

}

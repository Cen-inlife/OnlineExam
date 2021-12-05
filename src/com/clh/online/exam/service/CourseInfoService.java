package com.clh.online.exam.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.clh.online.exam.po.CourseInfo;


@Repository
public interface CourseInfoService {

	public List<CourseInfo> getCourses(CourseInfo course);

	public int isUpdateCourse(CourseInfo course);

	public int isAddCourse(CourseInfo course);

	public int isDelCourse(int courseId);
	
	public CourseInfo getCourseById(int courseId);
}

package com.springboot.learnrestapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn Rest API", "with Satyajit"),
				new Course(2, "Learn AWS", "with aamzon"))
				;
	}

}

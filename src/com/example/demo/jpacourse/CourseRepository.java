package com.example.demojpa.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, Integer>{
	
	public 	List<Course> findByStudentId(Integer StudentID);
	//public List<Course> getCoursesByStudent(StudentID);
	//public  List<Course> getStudentByName(String name);

}
package com.example.demojpa.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	//CRUD
	@Autowired
	CourseRepository courseRepository;

	List<Course> students = new ArrayList<>();


	/*
	 * public void createCourses() {
	 * 
	 * //students.add(new Course(1, "abc", 1, 85)); //students.add(new Course(2,
	 * "def", 2, 78)); //students.add(new Course(3, "ghi",3, 86));
	 * //students.add(new Course(4, "jkl", 4, 95)); }
	 */

	public List<Course> getCourses(int id){
		//createStudents();
		//return students;
		List<Course> students = new ArrayList<>();
		courseRepository.findByStudentId(id).forEach(students::add);
		return students;
	}
	
	public Course getCourse(int id) {
		return courseRepository.findById(id).get();
		
	}

	public void addCourse(Course student) {
		courseRepository.save(student);
		/*
		 * System.out.println("controllers add student"); students.add(student);
		 */
	}

	public void updateCourse(Course student) {
		courseRepository.save(student);
	}

	public void removeCourse(int id) {
		courseRepository.deleteById(id);
		//students.removeIf(s -> s.getId() == id);
	}

}
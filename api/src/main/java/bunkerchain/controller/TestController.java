package bunkerchain.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bunkerchain.entity.Course;
import bunkerchain.entity.Student;
import bunkerchain.repository.CourseRepository;
import bunkerchain.repository.StudentRepository;

@RestController
@RequestMapping("/users")
public class TestController {

	@Autowired
	CourseRepository courseRepository;
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public String Hello() {
		
		 Student student = new Student("John Doe", 15, "8th");

         // save the student
         studentRepository.save(student);

         // create three courses
         Course course1 = new Course("Machine Learning", "ML", 12, 1500);
         Course course2 = new Course("Database Systems", "DS", 8, 800);
         Course course3 = new Course("Web Basics", "WB", 10, 0);

         // save courses
         courseRepository.saveAll(Arrays.asList(course1, course2, course3));

         // add courses to the student
         student.getCourses().addAll(Arrays.asList(course1, course2, course3));

         // update the student
         studentRepository.save(student);
		return "hello world";
	}
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String showError() throws Exception {
		//int i=9/0;
				throw new Exception("this is test");
		
//		return "dd";
	}
}

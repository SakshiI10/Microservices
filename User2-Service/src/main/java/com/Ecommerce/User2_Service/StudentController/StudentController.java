package com.Ecommerce.User2_Service.StudentController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Ecommerce.User2_Service.client.CourseClient;

@RestController
@RequestMapping("/studentApi")
public class StudentController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CourseClient courseClient;
	
	@GetMapping("/student")
    public List<String> studentsName() {

        ArrayList<String> name = new ArrayList<>();

        name.add("SI");
        name.add("RK");
        name.add("SRK");

        return name;
    }
	
//	Rest Template Implementation for Inter-Service Communication: You can get the output at http://localhost:8080/studentApi/student-with-course 
//	@GetMapping("/student-with-course")
//	public Map<String, Object> getStudentWithCourse(){
//		List<String> students=studentsName();
//		List<String> course=restTemplate.getForObject("http://localhost:8081/courseApi/courses", List.class);
//		
//		Map<String, Object> response=new HashMap<>();
//		response.put("Students", students);
//		response.put("Courses", course);
//		
//		return response;
//	}

//	OpenFeign Implementation for Inter-Service Communication
	@GetMapping("/student-with-course")
	public Map<String, Object> getStudentWithCourse(){
		List<String> students=studentsName();
		List<String> course=courseClient.getCourses();
		
		Map<String, Object> response=new HashMap<>();
		response.put("Students", students);
		response.put("Courses", course);
		
		return response;
	}
}

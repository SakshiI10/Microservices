package com.Ecommerce.User2_Service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="User-Service")
public interface CourseClient {

	@GetMapping("/courseApi/courses")
	List<String> getCourses();
}

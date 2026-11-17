package com.Ecommerce.User_Service.CourseController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courseApi")
public class CourseController {

    @GetMapping("/courses")
    public List<String> coursesName() {

        ArrayList<String> name = new ArrayList<>();

        name.add("Java Developer");
        name.add("Cpp Developer");
        name.add("Python Developer");

        return name;
    }
}

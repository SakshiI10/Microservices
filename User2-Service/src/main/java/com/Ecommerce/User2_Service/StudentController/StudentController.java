package com.Ecommerce.User2_Service.StudentController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentApi")
public class StudentController {

	@GetMapping("/student")
    public List<String> coursesName() {

        ArrayList<String> name = new ArrayList<>();

        name.add("SI");
        name.add("RK");
        name.add("SRK");

        return name;
    }
}

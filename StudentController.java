package com.springboot.first.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/pupil")
	public Student getStudent() {
		return new Student("meysdays", true, 20, "I am Good");
	}
	
}

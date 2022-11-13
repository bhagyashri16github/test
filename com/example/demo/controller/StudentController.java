package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;



@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@GetMapping("/studentdata")
public String getTest()
{
	return "studentdata";
}

  @GetMapping("/getlist")
	public List<String>getstudentdata(){
		List<String>list = new ArrayList<String>();
		list.add("ram");
		list.add("10");
		list.add("pune");
		list.add("matin");
		list.add("20");
		list.add("kolhapur");

		return list;
	}
  @GetMapping("/getStudent")
  public Student getStudentDetails() {
		Student student= new Student();
		return student;
	}

}

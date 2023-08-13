package com.briz.validateDT;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
@Autowired
StudentRepository srepo;
@RequestMapping("/test")
public String test()
{
	return "this is test only";
}
@RequestMapping("/timetest")
public String testtime()
{
	Student s=new Student();
	s.setName("sohan");
	s.setCreatedtime(new java.util.Date());
	s.setUpdatedtime(new java.util.Date());
	s.setDob(new Date("02-03-2013"));
	s.setCreated_At(new java.util.Date());// ok working 
	srepo.save(s);
	
	return "this is time test only";
}
}

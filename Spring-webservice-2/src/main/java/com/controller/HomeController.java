package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;
import com.model.service.ServiceI;

public class HomeController {
	
	
	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String prelog()
	{
		System.out.println("this is welcome");
		return"welcome";
		
	}
	
	@RequestMapping("/getSingleData")
	public Student getSingleData() {
		System.out.println("this is single data");
		Student s=new Student();
		s.setAddress("pune");
		s.setId(1);
		s.setName("viraj");
		return si.save(s);
	}
	
	@GetMapping("/getAllData")
	public List<Student> getAllData()
	{
		Student s=new Student();
		s.setAddress("pune");
		s.setId(1);
		s.setName("viraj");
		
		Student s1=new Student();
		s1.setAddress("mumbai");
		s1.setId(2);
		s1.setName("rushikesh");
		 
		Student s2=new Student();
		s2.setAddress("solapur");
		s2.setId(3);
		s2.setName("sudarshan");
		
		List<Student> al=new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		return si.savealldata();
				
		
		
	}
	public void m1()
	{
		Syste.ut.println();
	}
	

}

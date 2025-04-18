package com.model.service;

import java.util.List;

import com.model.Student;

public interface ServiceI {
	 Student save(Student s);
	 Student getSingleData(int id);
	 List<Student> savealldata();
}

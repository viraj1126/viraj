package com.model.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Student;
import com.model.repository.StudentRepostitory;
import com.model.service.ServiceI;

public class Serviceimpl implements ServiceI{

	StudentRepostitory sr;
	
	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return sr.save();
	}

	@Override
	public Student getSingleData(int id) {
		// TODO Auto-generated method stub
		retur
	}

	@Override
	public List<Student> savealldata() {
		// TODO Auto-generated method stub
		return  r.saveAll();
	}
	
	

}

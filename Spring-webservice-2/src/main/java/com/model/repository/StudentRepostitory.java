package com.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;
@Repository
public interface StudentRepostitory extends CrudRepository<Student,Integer> {

}

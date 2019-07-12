package com.many.one.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.many.one.model.College;
//import com.many.one.model.College;
import com.many.one.model.Student;
import com.many.one.repository.CollegeRepository;
import com.many.one.repository.StudentRepository;

@Component
public class StudentService 
{
	@Autowired
	StudentRepository repository;
	@Autowired
	CollegeRepository repo;
	
	public Student insert(Student student)
	{
		return repository.save(student);
	}
	
	public ArrayList<Student> getAll()
	{
		return  (ArrayList<Student>) repository.findAll();
	}
	public College newInsert(College college)
	{
		return repo.save(college);
	}
	public ArrayList<College> newGetAll()
	{
		return (ArrayList<College>)repo.findAll();
	}
}
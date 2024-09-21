package com.practice.StudentMgmtSystem.Service;

import java.util.List;

import com.practice.StudentMgmtSystem.Entity.Student;



public interface StudentService {
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

}

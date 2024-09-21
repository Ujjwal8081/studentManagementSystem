package com.practice.StudentMgmtSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.StudentMgmtSystem.Entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}

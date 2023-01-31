package com.SB.Practice.SBPractice.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SB.Practice.SBPractice.Student.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}

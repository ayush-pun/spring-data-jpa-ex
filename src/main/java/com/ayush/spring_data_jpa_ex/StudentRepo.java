package com.ayush.spring_data_jpa_ex;

import com.ayush.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {


}

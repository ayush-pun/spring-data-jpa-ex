package com.ayush.spring_data_jpa_ex;

import com.ayush.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

       /** Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        s1.setRollNo(101);
        s1.setName("ayush");
        s1.setMarks(8);

        s2.setRollNo(102);
        s2.setName("anish");
        s2.setMarks(7);

        s3.setRollNo(103);
        s3.setName("sanjeel");
        s3.setMarks(7);

        repo.save(s1);
        repo.save(s2);
        repo.save(s3);
    **/
        System.out.println(repo.findAll());

        Optional<Student> s = repo.findById(104);
        System.out.println(s.orElse(new Student()));

        System.out.println("Name is ::  "+repo.findByName("ayush"));

        System.out.println("The person are  ::  "+repo.findByMarks(7));

        System.out.println("The people are  ::  "+repo.findByMarksGreaterThan(7));


	}

}

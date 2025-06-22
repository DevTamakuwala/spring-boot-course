package com.springbootcourse.app;

import com.springbootcourse.app.model.Student;
import com.springbootcourse.app.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootCourseApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootCourseApplication.class, args);
/*        System.out.println("Hello world");

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();

        LaptopService service = context.getBean(LaptopService.class);

        Laptop laptop = context.getBean(Laptop.class);
        service.addLaptop(laptop);*/


        Student student = context.getBean(Student.class);

        student.setRollNo(104);
        student.setName("John Doe");
        student.setMarks(78);

        StudentService service = context.getBean(StudentService.class);

        service.addStudent(student);

        List<Student> students = service.getStudents();
        System.out.println(students);
    }

}

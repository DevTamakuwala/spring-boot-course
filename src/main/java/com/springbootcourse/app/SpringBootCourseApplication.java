package com.springbootcourse.app;

import com.springbootcourse.app.model.Alien;
import com.springbootcourse.app.model.Laptop;
import com.springbootcourse.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCourseApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootCourseApplication.class, args);
        System.out.println("Hello world");

//        Alien alien = context.getBean(Alien.class);
//        System.out.println(alien.getAge());
//        alien.code();

        LaptopService service = context.getBean(LaptopService.class);

        Laptop laptop = context.getBean(Laptop.class);
        service.addLaptop(laptop);

    }

}

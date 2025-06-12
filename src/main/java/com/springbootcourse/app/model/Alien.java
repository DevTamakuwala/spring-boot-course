package com.springbootcourse.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;
//    @Qualifier("laptop")
//    @Autowired
    private Computer comp;
    private int salary;

    public Alien() {
        System.out.println("Alien Created");
    }

//    public Alien(int age, Laptop laptop, int salary) {
//        this.age = age;
//        this.laptop = laptop;
//        this.salary = salary;
//    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void code() {
        System.out.println("Coding...");
        comp.compiler();
    }

    public Computer getComp() {
        return comp;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

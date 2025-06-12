package com.springbootcourse.app.repository;

import com.springbootcourse.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void saveLaptop(Laptop laptop) {
        System.out.println("Laptop saved to the database");
    }
}

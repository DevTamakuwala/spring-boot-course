package com.springbootcourse.app.service;

import com.springbootcourse.app.model.Laptop;
import com.springbootcourse.app.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;
    public void addLaptop(Laptop laptop) {
        laptopRepository.saveLaptop(laptop);
    }

    public boolean isGoodForProg(Laptop laptop) {
        return true;
    }
}

package com.springbootcourse.app.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    @Override
    public void compiler() {
        System.out.println("Compiling from laptop");
    }
}

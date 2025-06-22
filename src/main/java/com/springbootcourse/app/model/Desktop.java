package com.springbootcourse.app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype") // This makes the bean prototype-scoped
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop constructor");
    }

    @Override
    public void compiler(){
        System.out.println("Compiling from desktop");
    }
}

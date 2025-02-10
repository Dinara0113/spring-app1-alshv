package com.alshv.springcourse.spring_app1_alshv;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("doing my init");
    }

    @PreDestroy
    public void doMyDestruct() {
        System.out.println("doing my dest");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}

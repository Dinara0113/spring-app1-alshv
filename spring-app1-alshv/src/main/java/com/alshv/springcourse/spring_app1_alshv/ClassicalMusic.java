package com.alshv.springcourse.spring_app1_alshv;

import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}

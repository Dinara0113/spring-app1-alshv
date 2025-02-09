package com.alshv.springcourse.spring_app1_alshv;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind Cries Mary";
    }
}

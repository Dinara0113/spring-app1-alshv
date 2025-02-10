package com.alshv.springcourse.spring_app1_alshv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();

    }
}

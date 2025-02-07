package com.alshv.springcourse.spring_app1_alshv;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");



        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // Вызов нового метода для воспроизведения всех песен
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}

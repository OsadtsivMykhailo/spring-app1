package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.springcourse.archive.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music1 = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music1);


       //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
       musicPlayer.playMusic();
//
//        MusicPlayer f2MusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comp = f1MusicPlayer == f2MusicPlayer;
//        System.out.println(comp);
//
//        f1MusicPlayer.setVolume(20);
//
//        System.out.println(f1MusicPlayer.getName());
//        System.out.println(f1MusicPlayer.getVolume());
//        System.out.println(f2MusicPlayer.getVolume());

//        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
        context.close();
    }
}

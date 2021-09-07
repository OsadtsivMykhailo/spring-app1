package ru.alishev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.springcourse.archive.TestBean;

import java.text.Annotation;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);



//        Music music1 = context.getBean("rockMusic", Music.class);
//        Music music2 = context.getBean("classicalMusic", Music.class);
////        MusicPlayer musicPlayer = new MusicPlayer();
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//       //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//       musicPlayer.playMusic();
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

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

      //  ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
       // ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

       // System.out.println(classicalMusic1==classicalMusic2);
        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}

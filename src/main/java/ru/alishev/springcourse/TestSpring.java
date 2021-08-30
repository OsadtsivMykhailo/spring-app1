package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.springcourse.archive.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music1 = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music1);

        musicPlayer.playMusic();

        context.close();
    }
}

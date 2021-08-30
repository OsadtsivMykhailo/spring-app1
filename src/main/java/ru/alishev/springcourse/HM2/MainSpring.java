package ru.alishev.springcourse.HM2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextHM2.xml"
        );

        Video video = context.getBean("filmBean", Video.class);
        VideoPlayer videoPlayer = new VideoPlayer(video);
        videoPlayer.playVideo();
        context.close();
    }
}

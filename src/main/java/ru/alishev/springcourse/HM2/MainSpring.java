package ru.alishev.springcourse.HM2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContextHM2.xml"
        );

    //1    Video video = context.getBean("filmBean", Video.class);
    //1    VideoPlayer videoPlayer = new VideoPlayer(video);
        VideoPlayer videoPlayer = context.getBean("videoPlayer", VideoPlayer.class);
        videoPlayer.playVideo();
        context.close();
    }
}

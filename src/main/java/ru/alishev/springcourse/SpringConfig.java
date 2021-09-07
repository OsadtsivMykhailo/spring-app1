package ru.alishev.springcourse;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import static ru.alishev.springcourse.ClassicalMusic.getClassicalMusic;

@Configuration
//@ComponentScan("ru.alishev.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return getClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer();
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}

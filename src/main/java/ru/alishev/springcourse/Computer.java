package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Computer {
    private int id;
//    @Autowired
    private MusicPlayer musicPlayer;

    private MusicGenre musicGenre = MusicGenre.rockMusic;


    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                " " + musicPlayer.playMusic(musicGenre) +
                '}';
    }
}

package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();

    private  Music music1;
    private  Music music2;
//    private  ClassicalMusic classicalMusic;
//    private  RockMusic rockMusic;

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
////        this.classicalMusic = classicalMusic;
////        this.rockMusic = rockMusic;
//    }
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    //    private String name;
//    private int volume;

    //IoC (Inversion of Control/dependancies)

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer() {
//    }
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    //    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

    public String playMusic() {
      //  for (int i = 0; i < musicList.size(); i++) {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
//            System.out.println("Playing: " + classicalMusic.getSong());
//            System.out.println("Playing: " + rockMusic.getSong());
        }
    }

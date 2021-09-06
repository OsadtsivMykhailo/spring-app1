package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
    private Music music1;
//    private String name;
//    private int volume;

    //IoC (Inversion of Control/dependancies)
    public MusicPlayer(Music music2) {
        this.music1 = music2;
    }

    public MusicPlayer() {
    }



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

    public void playMusic() {
      //  for (int i = 0; i < musicList.size(); i++) {
            System.out.println("Playing: " + music1.getSong());
        }
    }

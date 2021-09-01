package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    //IoC (Inversion of Control/dependancies)
//2    public MusicPlayer(Music music2) {
//2        this.music1 = music2;
//2    }

    public MusicPlayer() {
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }
    }
}

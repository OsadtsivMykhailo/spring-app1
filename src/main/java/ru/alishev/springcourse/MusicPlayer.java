package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
//    @Autowired
//    private ClassicalMusic classicalMusic;
//    //    @Autowired
//    private RockMusic rockMusic;
//
//    private RapMusic rapMusic;

    private List<Music> musicList = new ArrayList<>();

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
//    private  ClassicalMusic classicalMusic;
//    private  RockMusic rockMusic;

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
////        this.classicalMusic = classicalMusic;
////        this.rockMusic = rockMusic;
//    }



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

    public String playMusic() {
      //  for (int i = 0; i < musicList.size(); i++) {
        Random random = new Random();
        return "Playing: " + (musicList.get(random.nextInt(3))).getSong();
//        if (genre == MusicGenre.rockMusic) {
//            return "Playing: "; //+ rockMusic.getSong();
//        } else if (genre == MusicGenre.classicalMusic) {
//            return "Playing: "; //+ classicalMusic.getSong();
//        } else if (genre == MusicGenre.rapMusic) {
//            return "Playing: "; //+ rapMusic.getSong();
//        } else return "";
//            System.out.println("Playing: " + classicalMusic.getSong());
//            System.out.println("Playing: " + rockMusic.getSong());
        }
    }

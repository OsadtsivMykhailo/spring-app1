package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
    @Autowired
    private ClassicalMusic music1;
    @Autowired
    private RockMusic music2;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

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

    public String playMusic(MusicGenre genre) {
      //  for (int i = 0; i < musicList.size(); i++) {
        if (genre == MusicGenre.rockMusic) {
            return "Playing: " + music2.getSong();
        } else if (genre == MusicGenre.classicalMusic) {
            return "Playing: " + music1.getSong();
        } else return "";
//            System.out.println("Playing: " + classicalMusic.getSong());
//            System.out.println("Playing: " + rockMusic.getSong());
        }
    }

package ru.alishev.springcourse;

public class MusicPlayer {
    private Music music1;

    private String name;
    private int volume;

    //IoC (Inversion of Control/dependancies)
//2    public MusicPlayer(Music music2) {
//2        this.music1 = music2;
//2    }

    public MusicPlayer() {
    }

    public void setMusic1(Music music1) {
        this.music1 = music1;
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
        System.out.println("Playing: " + music1.getSong());
    }
}

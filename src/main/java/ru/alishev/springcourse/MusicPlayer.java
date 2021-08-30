package ru.alishev.springcourse;

public class MusicPlayer {
    private Music music1;

    //IoC (Inversion of Control/dependancies)
    public MusicPlayer(Music music2) {
        this.music1 = music2;
    }

    public void playMusic() {
        System.out.println("Playing: " + music1.getSong());
    }
}

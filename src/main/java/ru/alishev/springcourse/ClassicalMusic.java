package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    final Random random = new Random();
    private ArrayList<String> classicalMusicSongsList =
            new ArrayList<>(Arrays.asList("ClasSong1", "ClasSong2", "ClasSong3"));
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }


    public  void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return classicalMusicSongsList.get(random.nextInt(3));
    }
}

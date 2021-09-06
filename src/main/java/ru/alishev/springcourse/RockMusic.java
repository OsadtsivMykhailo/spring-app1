package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component
public class RockMusic implements Music{
    final Random random = new Random();
    private ArrayList<String> rockMusicSongsList =
            new ArrayList<>(Arrays.asList("RockSong1", "RockSong2", "RockSong3"));

    public  void doMyInit() {
        System.out.println("Doing my Rock initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my Rock destruction");
    }

    @Override
    public String getSong() {
        return rockMusicSongsList.get(random.nextInt(3));
    }
}

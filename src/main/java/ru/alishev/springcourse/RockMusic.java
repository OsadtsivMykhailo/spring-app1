package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    public  void doMyInit() {
        System.out.println("Doing my Rock initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my Rock destruction");
    }

    @Override
    public String getSong() {
        return "We are the champions";
    }
}

package org.generalov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

public class RockMusic implements Music{
    @Value("#{'${RockMusic.songs}'.split(',')}")
    List<String> songs;


    public RockMusic(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public String getSong() {
        int i = new Random().nextInt(3);
        return songs.get(i);
    }
}

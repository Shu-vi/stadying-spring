package org.generalov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musics;
    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musics) {
       this.musics = musics;
    }

    public String playMusic(){
        int i = new Random().nextInt(musics.size());
        return musics.get(i).getSong() +
                "\nМузыкальный плеер - " + name +
                "\nГромкость - " + volume;
    }
}

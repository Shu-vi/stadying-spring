package org.generalov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;

@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {
    @Bean
    public ArrayList<String> arrayList(){
        return new ArrayList<>();
    }

    @Bean
    public ArrayList<String> arrayList2(){
        return new ArrayList<>();
    }

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic(arrayList());
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic(arrayList2());
    }

    @Bean
    public ArrayList<Music> musics(){
        ArrayList<Music> musics = new ArrayList<>();
        musics.add(classicalMusic());
        musics.add(rockMusic());
        return musics;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musics());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}

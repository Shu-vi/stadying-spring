package org.generalov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;




public class ClassicalMusic implements Music{
    @Value("#{'${ClassicalMusic.songs}'.split(',')}")
    private List<String> songs;

    public ClassicalMusic(List<String> songs){
        this.songs = songs;
    }

    @Override
    public String getSong() {
        int i = new Random().nextInt(3);
        return songs.get(i);
    }
}

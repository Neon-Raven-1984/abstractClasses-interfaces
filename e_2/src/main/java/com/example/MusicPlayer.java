package com.example;

public class MusicPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("🎵 Playing audio file...");
    }

    @Override
    public void stop() {
        System.out.println("⏹ Music stopped.");
    }
}

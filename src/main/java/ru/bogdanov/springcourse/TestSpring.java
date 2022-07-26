package ru.bogdanov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(musicPlayer);
//        System.out.println(musicPlayer2);
//        System.out.println(musicPlayer == musicPlayer2);
//
//        musicPlayer2.setVolume(50);
//        System.out.println("player2 volume: " + musicPlayer2.getVolume());
//
////        Music music = context.getBean("musicBean", Music.class);
////
////        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//        System.out.println("Player: " + musicPlayer.getName());
//        System.out.println("Volume: " + musicPlayer.getVolume());

        context.close();
    }
}

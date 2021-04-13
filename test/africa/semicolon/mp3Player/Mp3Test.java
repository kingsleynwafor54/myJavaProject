package africa.semicolon.mp3Player;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class Mp3Test {


    @Test
    void mp3Player_canBeCreated() {
        Mp3Player myMp3Player = new Mp3Player();

        assertNotNull(myMp3Player);
    }


    @Test
    void mp3_turnsOff_whenFlipperPowerButtonIsPressed_onOnState() {
        Mp3Player myMp3Player = new Mp3Player();
        boolean isOff = !myMp3Player.isOn();
        assertTrue(isOff);
        assertFalse(myMp3Player.isOn());
        myMp3Player.flipPowerButton();
        assertTrue(myMp3Player.isOn());
    }

    @Test
    void mp3_turnsOn_whenFlipperPowerButtonIsPressed_onOffState() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.turnOn();
        boolean isOn = myMp3Player.isOn();
        assertTrue(isOn);
        myMp3Player.flipPowerButton();
        assertFalse(myMp3Player.isOn());
    }

    @Test
    void mp3PlayerCantDownloadMusic() {
        Mp3Player myMp3Player = new Mp3Player();
        //  Music music = new Music();

        //assertTrue(myMp3Player.isOn());
        myMp3Player.flipPowerButton();
        assertTrue(myMp3Player.isOn());
        Music music = new Music();
        assertNotNull(music);


        //when
        myMp3Player.download(music);
        //
        assertEquals(1, myMp3Player.getTotalNumberMusic());
        Music secondMusic = new Music();
        myMp3Player.download(secondMusic);
        assertEquals(2, myMp3Player.getTotalNumberMusic());


    }



    @Test
    void toDeleteMusic() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.flipPowerButton();
        //  assertTrue(myMp3Player.isOn());
        Music music = new Music();

        //   myMp3Player.flipPowerButton();
        //  assertFalse (myMp3Player.isOn());

        //myMp3Player.deleteMusic(music);
        //assertEquals(0, myMp3Player.getTotalNumberMusic());
        //   assertEquals(0,myMp3Player.getTotalNumberMusic());
    }
    // @Test
    //      void mp3Player_cantDeleteMusic_WhenItIsSwitchedOf(){

    @Test
    void mp3Player_cannotDownloadSameSongTwice() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.flipPowerButton();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberMusic());
    }

    @Test
    void mp3Player_canPlayMusic() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.flipPowerButton();
        Music ajibole = new Music();
        myMp3Player.download(ajibole);
        assertEquals(1, myMp3Player.getTotalNumberMusic());

        Music komole = new Music();
        myMp3Player.playMusic(komole);
        assertEquals(2, myMp3Player.getCurrentlyPlayingMusic());

        Music Alanta = new Music();
        myMp3Player.playMusic(Alanta);
        assertEquals(3, myMp3Player.getCurrentlyPlayingMusic());

    }

    @Test
    void mp3Player_trackAmountOfUsers() {
        Mp3Player myMp3Player = new Mp3Player();
        Mp3Player myMp3Player1 = new Mp3Player();
        Mp3Player myMp3Player2 = new Mp3Player();
        Mp3Player myMp3Player3 = new Mp3Player();
        assertEquals(4, myMp3Player2.getCurrentlyPlayingMusic());

    }

    @Test
    void mp3Player_canIncreaseVolume() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        assertEquals(2, myMp3Player.getVolume());
    }

    @Test
    void my3Player_canSetVolume() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.setVolume(5);
        assertEquals(5, myMp3Player.getVolume());
    }

    @Test
    void my3Player_cannotSetNegativeVolume() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.setVolume(-1);
        assertEquals(0, myMp3Player.getVolume());
    }

    @Test
    void my3Player_cannotSetAbove30ValuesForVolume() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.setVolume(31);
        assertEquals(0, myMp3Player.getVolume());
    }

    @Test
    void my3Player_canDecreaseVolume() {
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.decreaseVolume();
        assertEquals(0, mp3Player.getVolume());
    }

    @Test
    void mp3Player_canIncreaseAndDecreaseVolume() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.decreaseVolume();
        assertEquals(4, myMp3Player.getVolume());
    }

    @Test
    void mp3PlayerCantDeleteDownloadedMusic() {
        Mp3Player myMp3Player = new Mp3Player();
        //  Music music = new Music();

        //assertTrue(myMp3Player.isOn());
        myMp3Player.flipPowerButton();
        assertTrue(myMp3Player.isOn());
        Music music = new Music();
        assertNotNull(music);


        //when
        myMp3Player.download(music);
        //
        assertEquals(1, myMp3Player.getTotalNumberMusic());
        Music secondMusic = new Music();
        myMp3Player.download(secondMusic);
        assertEquals(2, myMp3Player.getTotalNumberMusic());
        myMp3Player.deleteDownloadedMic(secondMusic);
        assertEquals(1, myMp3Player.getTotalNumberMusic());
    }

    @Test
    void mp3PlayerCanTrackTimeOfSong() {
        Mp3Player mp3Player = new Mp3Player();
        Music music = new Music();
        mp3Player.download(music);
        mp3Player.musicTime(01,19,12);
        mp3Player.displayProperties();
    }
}
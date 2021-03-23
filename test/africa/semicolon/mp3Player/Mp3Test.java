/*package africa.semicolon.mp3Player;

import africa.semicolon.mp3Player.Mp3Player;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

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
        void mp3PlayerCanDownloadMusic() {
            Mp3Player myMp3Player = new Mp3Player();
            assertFalse(myMp3Player.isOn());
            Music music =new Music();

            assertNotNull(music);


            //when
            myMp3Player.download(music);
            //
            assertEquals(1, myMp3Player.getTotalNumberMusic());
            Music secondMusic = new Music();
            myMp3Player.download(music);
            assertEquals(2, myMp3Player.getTotalNumberMusic());



        }

        @Test
        void toDeleteMusic(){
            Mp3Player myMp3Player =new Mp3Player();
            myMp3Player.flipPowerButton();
          //  assertTrue(myMp3Player.isOn());
            Music music=new Music();

         //   myMp3Player.flipPowerButton();
          //  assertFalse (myMp3Player.isOn());

            myMp3Player.deleteMusic(music);
            assertEquals(0,myMp3Player.getTotalNumberMusic());
         //   assertEquals(0,myMp3Player.getTotalNumberMusic());
        }
  // @Test
  //      void mp3Player_cantDeleteMusic_WhenItIsSwitchedOf(){

  @Test
        void mp3Player_cannotDownloadSameSongTwice(){
            Mp3Player myMp3Player=new Mp3Player();
            myMp3Player.flipPowerButton();
            Music music = new Music();
            myMp3Player.download(music);
            assertEquals(1,myMp3Player.getTotalNumberMusic());
  }

@Test
      void  mp3Player_canPlayMusic(){
            Mp3Player myMp3Player=new Mp3Player();
            myMp3Player.flipPowerButton();
            Music ajibole =new Music();
            myMp3Player.download(ajibole);
            assertEquals(1,myMp3Player.getTotalNumberMusic());


            myMp3Player.playMusic(ajibole);
            assertEquals(1,myMp3Player.getCurrentlyPlayingMusic());

}

   }
*/
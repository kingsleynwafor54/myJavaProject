package africa.semicolon.mp3Player;

import java.util.ArrayList;

public class Mp3Player {
  //  private final africa.semicolon.mp3Player.MusicTime MusicTime;
    private boolean isOn;
    private static int totalNumberOfMusic;
    private ArrayList<Music> musicList = new ArrayList<>();
    private Music currentlyPlayingMusic;
    private MusicState isCurrentPlayingMusic;
    private int volume;
    private int hour;
    private int minute;
    private int seconds;



 private Music [] musicCase;


    public Mp3Player(int totalNumberOfMusic,int volume){
    musicCase=new Music[totalNumberOfMusic];
    if(volume>=0 && volume <=30)
        this.volume=volume;

}
public Mp3Player(){
    totalNumberOfMusic++;
}
    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }


    public void turnOff() {
        isOn = false;
    }

    public void flipPowerButton() {
        isOn = !isOn;
    }


    public void download(Music music) {
        if (isOn)
            if (!musicList.contains(music))
                musicList.add(music);
    }

    public int getTotalNumberMusic() {
        return musicList.size();
    }

//    public void deleteMusic(Music music) {
//        if (isOn)
//            musicList.remove(music);
//    }

    public void playMusic(Music music) {
       currentlyPlayingMusic = music;
        totalNumberOfMusic++;
    }

    public boolean isPlaying() {
        return false;
    }

    public int getCurrentlyPlayingMusic() {
        return totalNumberOfMusic;
    }

    public int getVolume() {

        return this.volume;
    }
    public void increaseVolume(){

        this.volume+=1;
    }
    public void setVolume(int volume){
        if (volume>=0 && volume<=30)
            this.volume=volume;
    }
public void decreaseVolume(){
if(this.volume>0)
        this.volume-=1;
}
    public void deleteDownloadedMic(Music music) {
        if (isOn)
            if (musicList.contains(music))
                musicList.remove(music);
}

    public void musicTime(int hour, int minute, int seconds){
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (seconds < 0 || seconds >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
    public void displayProperties(){
        System.out.println(hour+"hr: "+minute+"m: "+seconds+"s");
    }
}

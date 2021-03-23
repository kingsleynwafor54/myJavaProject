/*package africa.semicolon.mp3Player;

import java.util.ArrayList;

public class Mp3Player {
    private boolean isOn;
    private int totalNumberOfMusic;
    private ArrayList<Music> musicList = new ArrayList<>();
    private Music currentlyPlayingMusic;
    private MusicState isCurrentPlayingMusic;


// private Music [] musicList;
//public Mp3Player(int numberOfMusic){
//    musicList=new Music[numberOfMusic];
//}

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

    public void deleteMusic(Music music) {
        if (isOn)
            musicList.remove(music);
    }

    public void playMusic(Music music) {
        currentlyPlayingMusic = music;
        currentlyPlayingMusic = PLAYING;
    }

    public boolean isPlaying() {
        return false;
    }

    public Music getCurrentlyPlayingMusic() {
        return currentlyPlayingMusic;
    }
}
*/
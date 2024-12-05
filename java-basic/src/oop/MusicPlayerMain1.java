package oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.showStatus();
        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.off();
    }
}

package acces;

import java.util.logging.SocketHandler;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }
    void volumeUp(){
        if(volume >= 100){
            System.out.println("용량 최대");
        }else {
            volume += 10;
            System.out.println("볼륨 10 증가");
        }
    }
    void volumeDown(){
        volume -= 10;
        System.out.println("볼륨 10 감소");
    }
    void showVolume(){
        System.out.println("현재 볼륨: " + volume);
    }
}

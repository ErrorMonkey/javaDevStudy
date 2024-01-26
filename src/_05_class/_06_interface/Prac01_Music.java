package _05_class._06_interface;

public class Prac01_Music {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();
        CdPlayer cdPlayer = new CdPlayer();

        mp3Player.play("아이유 블루밍");
        mp3Player.stop();

        cdPlayer.play("아이유 책갈피");
        cdPlayer.stop();

    }
}

class Mp3Player implements Music {
    @Override
    public void play(String song) {
        System.out.printf("mp3 플레이어 %s 재생", song).println();
    }
    @Override
    public void stop() {
        System.out.println("mp3 플레이어 재생 중지");
    }
}

class CdPlayer implements Music {
    @Override
    public void play(String song) {
        System.out.printf("cd 플레이어 %s 앨범 재생", song).println();
    }
    @Override
    public void stop() {
        System.out.println("cd 플레이어 재생 중지");
    }
}

interface Music {
    public void play(String song);
    public void stop();
}
package OOP.Video5.Interfaces;

public class MediaPlayer implements Mplayer {

    @Override
    public void start() {
        System.out.println("Media player starts playing");
    }

    @Override
    public void stop() {
        System.out.println("Media player stopped playing");
    }
}

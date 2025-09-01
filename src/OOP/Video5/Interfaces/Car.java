package OOP.Video5.Interfaces;

public class Car  {
    private Engine engine;
    private Mplayer mplayer;

    public Car() {
        this.engine = new PetrolEngine();
        this.mplayer = new MediaPlayer();
    }

    public Car(Engine engine, Mplayer mplayer) {
        this.engine = engine;
        this.mplayer = mplayer;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerating() {
        engine.accelerate();
    }

    public void musicStart() {
        mplayer.start();
    }

    public void musicStop() {
        mplayer.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }

}

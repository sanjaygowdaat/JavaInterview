package OOP.Video5.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car c1 = new Car();
//        c1.start();
//        c1.stop();
//        c1.musicStart();
//        c1.musicStop();

        Car c2 = new Car(new ElectricEngine(), new MediaPlayer());
        c2.start();
        c2.accelerating();
        c2.musicStart();
        c2.stop();

        c2.upgradeEngine(new PetrolEngine());
        c2.start();
        c2.accelerating();
        c2.stop();
    }
}

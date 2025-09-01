package OOP.Video5.Interfaces;

public class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Petrol Engine Car is accelerating");
    }
}

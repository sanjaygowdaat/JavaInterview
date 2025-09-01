package OOP.Coupling;

// https://stackoverflow.com/questions/2832017/what-is-the-difference-between-loose-coupling-and-tight-coupling-in-the-object-o

public class LooseCoupling {
    public static void main(String[] args) {
        // this is loose coupling because i can change the engine of the car without modifying Car Class
        // hence Car class is loosely coupled with engine object
        // if i create engine object inside the car class itself instead of passing engine from here, that would be tight coupling
        // and the i would have to modify Car class if i have to change engines.
        // with loose coupling and using interfaces, i can change engine without changing anything inside car class
        Car car = new Car(new PetrolEngine());
        car.startCar();

    }
}

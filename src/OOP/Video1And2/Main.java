package OOP.Video1And2;

public class Main {
    public static void main(String[] args) {
//        Human random1 = new Human();
//        Human random2 = new Human();
//        Human random3 = new Human();
//        Human random4 = new Human();
//        Human random5 = new Human();
//        Human random6 = new Human();

        // accessing static variables via instance variable is possible but not encouraged,
        // use class name instead to access static variables.
//        System.out.println(random1.population);
//        System.out.println(Human.population);
        sayHello();

    }

    // static variables, static methods etc can be called anywhere inside the class as it belongs to the class
    // but to call non-static methods or use instance variables, we need objects of that class as instance
    //variables and instance methods belong to objects/instances.
    // we can create objects inside any static methods
    static void sayHello() {
        Main obj = new Main();
        obj.greeting();
        System.out.println("Hello");
    }

    void greeting() {
        System.out.println("Hey there!");
    }

}

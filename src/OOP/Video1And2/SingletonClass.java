package OOP.Video1And2;

public class SingletonClass {

    /* one way of many ways to do it, A Singleton class in Java is a design pattern that ensures only one instance
     of a class is created in the entire JVM and provides a global point of access to that instance.
    -> Use Cases (Real, Practical)
    1. Logging service – you don’t want multiple logger instances writing to different files.
    2. Configuration manager – loads system-wide configs once.
    3. Database connection pool manager – ensures a single pool is used.
    4. Caching mechanisms – shared memory cache like LRU or LFU.*/

    /* String name;
    private static final SingletonClass instance = new SingletonClass();
    private SingletonClass() {
        this.name = "Adi";
    }
    static SingletonClass getInstance() {
        return instance;
    }*/

    String name;
    private static SingletonClass instance;
    private SingletonClass() {
        this.name = "Adi";
    }

    static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

class Main2 {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        System.out.println(obj.name);
    }
}
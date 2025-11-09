package singleton.pattern;

public class EagerSingleton {
    //JVM guarantees class loading of static variables in a thread safe manner
    //No explicit thread safety is needed
    private static final EagerSingleton instance = new EagerSingleton();
    String value;

    private EagerSingleton () {
        System.out.println("Initializing EagerSingleton");
        value = "Eager Singleton - Hello World!!";
    }

    public static EagerSingleton getInstance () {
        return instance;
    }
}

package singleton.pattern;

public class LazyDoubleCheckedSingleton {
    /** Volatile keyword is absolutely necessary to ensure race ahead condition does not occur
        & other threads don't see partially created objects.
        Object creation happens in 3 steps, 1. alloc mem 2. obj initialization 3. update reference
        Without volatile, 2 & 3 might happen out of sync as optimized by JVM which might cause other threads to see
        objects that are referenced in the memory but not initialized yet
    **/
    private static volatile LazyDoubleCheckedSingleton instance;
    String value;

    private LazyDoubleCheckedSingleton () {
        value = "Lazy Double Checked Singleton - Hello World!!";
    }

    public static LazyDoubleCheckedSingleton getInstance () {
        //1st check avoids synchronization overhead if instance is already created
        if (instance == null) {
            //Ensures only 1 thread accesses the critical section
            synchronized (LazyDoubleCheckedSingleton.class) {
                //2nd check necessary since multiple threads might have passed the 1st check
                if (instance == null) {
                    System.out.println("Initializing LazyDoubleCheckedSingleton");
                    instance = new LazyDoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
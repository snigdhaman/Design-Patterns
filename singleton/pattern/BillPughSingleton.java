package singleton.pattern;

/**
 * Works in a similar fashion to eager singleton but the inner helper class ensure lazy loading.
 * Thread safety is guaranteed by the JVM
 */
public class BillPughSingleton {
    String value;

    private BillPughSingleton () {
        System.out.println("Inside BillPughSingleton initialization");
        value = "Bill Pugh Singleton - Hello World!!";
    }

    private static class BillPughSingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return BillPughSingletonHelper.instance;
    }
}

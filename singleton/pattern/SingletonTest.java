package singleton.pattern;

public class SingletonTest {
    public static void main (String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton.value);

        LazyDoubleCheckedSingleton lazyDoubleCheckedSingleton = LazyDoubleCheckedSingleton.getInstance();
        System.out.println(lazyDoubleCheckedSingleton.value);

        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        System.out.println(billPughSingleton.value);

    }
}

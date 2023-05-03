package abstractconstructor;

public class SafeInitCounterImpl extends SafeInitCounter {
    public SafeInitCounterImpl() {
    }

    public SafeInitCounterImpl(int counter) {
        super(counter);
    }

    @Override
    int increment() {
        return ++counter;
    }

    public static void main(String[] args) {
        SafeInitCounter test = new SafeInitCounterImpl(2);
        test.increment();
        System.out.println(test.counter);

    }
}

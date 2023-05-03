package abstractconstructor;

public abstract class SafeInitCounter {
    int counter;

    public SafeInitCounter() {
        this.counter = 0;
        System.out.println("init no-arg constructor");


    }

    public SafeInitCounter(int counter) {
        this.counter = counter;
        System.out.println("init sup parameterized constructor");
    }

    abstract int increment();
}


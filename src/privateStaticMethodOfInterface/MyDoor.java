package privateStaticMethodOfInterface;

public class MyDoor implements PrivateMethodDoor {

    @Override
    public void fooWithPrivateMethod() {
        System.out.println("foo from mydoor");

    }

    public static void main(String[] args) {
        PrivateMethodDoor mydoor = new MyDoor();
        mydoor.fooWithPrivateMethod();
        mydoor.foo();
        PrivateMethodDoor.staticFoo();
        PrivateMethodDoor.staticBuz();

    }

}

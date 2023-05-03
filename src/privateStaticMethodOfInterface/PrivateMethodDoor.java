package privateStaticMethodOfInterface;
//form java 9 can user private methods in interface.
/*Advantages of interfaces
//Interfaces allow us to achieve 100% abstraction.
//Interfaces can be used to achieve loose coupling in an application.
This means that a change in one class doesn’t affect the implementation of the other class.
//By the use of interfaces, one can break up complex designs and clear the dependencies between objects.
Interfaces can be used to achieve multiple inheritance.*/
public interface PrivateMethodDoor {
    default void foo(){
        System.out.println("default foo");
        PrivateMethodDoor.staticBuz();



    }
    static void staticFoo(){
        staticBuz();
        //privateBuz();

    }
    void fooWithPrivateMethod();
    static void staticBuz(){
        System.out.println("public static buz from door interface");

    }
    /*private static privateStaticBuz(){
        System.out.println("private static buz from door interface");

    }
    private void privateBuz(){
        System.out.println("private buz from door interface");

    }*/
}

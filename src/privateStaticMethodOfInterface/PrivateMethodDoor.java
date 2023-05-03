package privateStaticMethodOfInterface;
//form java 9 can user private methods in interface.
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

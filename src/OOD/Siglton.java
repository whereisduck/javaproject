package OOD;

import java.util.concurrent.locks.Lock;

public class Siglton {
    //Remember the key points while defining a class as a singleton class
    // that is while designing a singleton class:
    //Make a constructor private.
    //Write a static method that has the return type object of this singleton class.
    // Here, the concept of Lazy initialization is used to write this static method.
    private static Siglton siglton =null;
    //private static Object object;
    private Siglton(){}
    public static Siglton getInstance(){
        if(siglton == null){
            synchronized (Siglton.class){
                if (siglton == null){
                    siglton = new Siglton();
                }
            }

        }

        return siglton;
    }


}

package abstractconstructor;
//We can declare a constructor with no arguments in an abstract class.
// It will override the default constructor,
// and any subclass creation will call it first if its not private in the construction chain.
public class NoArgConstructorImpl extends NoArgConstructor {
    int arg;

    public NoArgConstructorImpl() {
        System.out.println("initializing from sub constructor");
    }

    public NoArgConstructorImpl(int arg) {
        this.arg = arg;
        System.out.println("initializing from sub arg constructor");

    }

    public static void main(String[] args) {
        NoArgConstructor test = new NoArgConstructorImpl(2);

    }
}

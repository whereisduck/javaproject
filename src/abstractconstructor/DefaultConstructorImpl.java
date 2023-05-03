package abstractconstructor;
//When a class doesn't declare any constructor, the compiler creates a default constructor for us.
// This is also true for abstract classes.
// Even when there's no explicit constructor, the abstract class will have a default constructor available.
//In an abstract class, its descendants can invoke the abstract default constructor using super():
public class DefaultConstructorImpl extends DefaultConstructor {
    public DefaultConstructorImpl() {
        super();
    }

    public static void main(String[] args) {
        DefaultConstructor test = new DefaultConstructorImpl();


    }
}


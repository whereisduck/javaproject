package OOD.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        //get a shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        //from a shape factory create a shape instance
        Shape square = shapeFactory.getShape("SQUARE");

        //implement draw method inside the shape instance;
        square.draw();

        //get a rounded factory
        AbstractFactory roundedFactory = FactoryProducer.getFactory(true);

        // from a rounded factory create a roundedSquare instance
        Shape roundedSquare = roundedFactory.getShape("SQUARE");

        //implement draw method inside the shape instance;
        roundedSquare.draw();



    }


    /*
// create shape interface and the shape classes implements it;
    public interface Shape {
        void draw();

    }

    public class RoundedRectangle implements Shape{

        @Override
        public void draw() {
            System.out.println("Inside RoundedRectangle::draw() method.");
        }
    }

    public class RoundedSquare implements Shape {
        @Override
        public void draw() {
            System.out.println("Inside RoundedSquare::draw() method.");
        }
    }
    public class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Inside Rectangle::draw() method.");
        }
    }
    public class Square implements Shape {
            @Override
            public void draw() {
                System.out.println("Inside Square::draw() method.");
            }
        }


    //Create abstract factory class and the shapeFactory and RoundedFactory extends it;
    public abstract class AbstractFactory{
        abstract Shape getShape(String shapeType);
    }
    public class ShapeFactory extends AbstractFactory{

        @Override
        Shape getShape(String shapeType) {
            if(shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            }else if(shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }
            return null;
        }
    }

    public class RoundedFactory extends AbstractFactory{

        @Override
        Shape getShape(String shapeType) {
                if(shapeType.equalsIgnoreCase("RECTANGLE")){
                    return new RoundedRectangle();
                }else if(shapeType.equalsIgnoreCase("SQUARE")){
                    return new RoundedSquare();
                }

                return null;
        }
    }

    //Create a Factory generator/producer class
    // to get factories(ShapeFactory and RoundedFactory) by passing an information
    // such as Shape or Rounded;

    public class FactoryProducer {
        public  static AbstractFactory getFactory(boolean rounded){
            if (rounded){
                return new RoundedFactory();
            } else{
                return new  ShapeFactory();
            }
        }



     */




}




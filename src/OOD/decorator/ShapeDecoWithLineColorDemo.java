package OOD.decorator;

public class ShapeDecoWithLineColorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(rectangle);
        circle.draw();
        redCircle.draw();
        rectangle.draw();
        redRectangle.draw();



    }
}

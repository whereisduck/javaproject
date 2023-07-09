package OOD.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);


    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border coloe: Red");
    }

}

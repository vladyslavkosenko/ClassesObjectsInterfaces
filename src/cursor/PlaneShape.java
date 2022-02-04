package cursor;

public abstract class PlaneShape extends Shape
        implements AreaMeasurable, PerimeterMeasurable {
    public PlaneShape(Point[] vertices) {
        super(vertices);
    }
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
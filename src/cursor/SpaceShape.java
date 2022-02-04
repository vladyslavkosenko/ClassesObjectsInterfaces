package cursor;

public abstract class SpaceShape extends Shape
        implements AreaMeasurable, VolumeMeasurable {
    public SpaceShape(Point[] vertices) {
        super(vertices);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

}
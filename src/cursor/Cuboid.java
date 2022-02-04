package cursor;


public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;
    private double area;
    private double volume;

    public Cuboid(Point[] vertices, double width, double height, double depth) {
        super(vertices);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        area = 2 * (width * depth + width * height + depth * height);
        return area;
    }

    @Override
    public double getVolume() {
        volume = height * width * depth;
        return volume;
    }
}
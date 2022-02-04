package cursor;


public class SquarePyramid extends SpaceShape {
    private double width;
    private double height;
    private double area;
    private double volume;


    public SquarePyramid(Point[] vertices, double v, int i) {
        super(vertices);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        area = Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) * width;
        return area;
    }

    @Override
    public double getVolume() {
        volume = width * width * height / 3;
        return volume;
    }
}
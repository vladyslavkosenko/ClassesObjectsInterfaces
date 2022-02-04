package cursor;


import java.util.Arrays;

public class Sphere extends SpaceShape {
    private double radius;
    private double area;
    private double volume;

    public Sphere(Point[] vertices, double radius) {
        super(vertices);
        this.vertices = vertices;
    }

    @Override
    public double getArea() {
        area = 4 * Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getVolume() {
        volume = Math.PI * Math.pow(radius, 3) * 4 / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "vertices=" + Arrays.toString(vertices) +
                ", radius=" + radius +
                ", area=" + area +
                ", volume=" + volume +
                '}';
    }

}



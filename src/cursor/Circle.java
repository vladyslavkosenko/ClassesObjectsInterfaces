package cursor;


import java.util.Arrays;

public class Circle extends PlaneShape {
    private double radius;
    private double perimeter;
    private double area;

    public Circle(Point[] vertices, double radius) {
        super(vertices);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", perimeter=" + perimeter +
                ", area=" + area +
                ", vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
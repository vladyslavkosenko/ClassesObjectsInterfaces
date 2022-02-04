package cursor;


import java.util.Arrays;

public class Triangle extends PlaneShape {
    private double perimeter;
    private double area;


    public Triangle(Point[] vertices) {
        super(vertices);
    }

    @Override
    public double getArea() {
        double p = perimeter / 2;
        area = Math.sqrt(p * (p - distance(getVertices()[0], getVertices()[1])) * (p - distance(getVertices()[1], getVertices()[2])) * (p - distance(getVertices()[0], getVertices()[2])));
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = distance(getVertices()[0], getVertices()[1]) + distance(getVertices()[1], getVertices()[2]) + distance(getVertices()[0], getVertices()[2]);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertices=" + Arrays.toString(vertices) +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}


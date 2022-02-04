package cursor;


import java.util.Arrays;

public class Rectangle extends PlaneShape {
    private double perimeter;
    private double area;
    private double width;
    private double height;

    public Rectangle(Point[] vertices, double width, double height) {
        super(vertices);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        area = height * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = (height + width) * 2;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                ", width=" + width +
                ", height=" + height +
                ", vertices=" + Arrays.toString(vertices) +
                '}';
    }
}






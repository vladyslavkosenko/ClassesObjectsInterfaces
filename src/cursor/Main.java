package cursor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape[] shape = new Shape[6];
        Point[] pointOfTriangle = new Point[3];
        pointOfTriangle[0] = new Point(3,4);
        pointOfTriangle[1] = new Point(4,3);
        pointOfTriangle[2] = new Point(3,4);
        Triangle triangle = new Triangle(pointOfTriangle);
        triangle.getPerimeter();
        triangle.getArea();
        Point[] pointOfRectangle = new Point[1];
        pointOfRectangle[0] = new Point(1, 2);
        Rectangle rectangle = new Rectangle(pointOfRectangle, 14, 8);
        rectangle.getPerimeter();
        rectangle.getArea();
        Point[] pointOfCircle = new Point[1];
        pointOfCircle[0] = new Point(1, 2);
        Circle circle = new Circle(pointOfCircle, 9);
        circle.getPerimeter();
        circle.getArea();
        Point[] pointOfSpaceShape = new Point[1];
        pointOfSpaceShape[0] = new Point(5, 6, 7.3);
        SquarePyramid squarePyramid = new SquarePyramid(pointOfSpaceShape, 16.5, 18);
        squarePyramid.getArea();
        squarePyramid.getVolume();
        Cuboid cuboid = new Cuboid(pointOfSpaceShape, 10.1, 10.8, 10.6);
        cuboid.getArea();
        cuboid.getVolume();
        Sphere sphere = new Sphere(pointOfSpaceShape, 50.4);
        sphere.getArea();
        sphere.getVolume();
        shape[0] = triangle;
        shape[1] = rectangle;
        shape[2] = circle;
        shape[3] = squarePyramid;
        shape[4] = cuboid;
        shape[5] = sphere;
        System.out.println(Arrays.toString(shape));


    }
}

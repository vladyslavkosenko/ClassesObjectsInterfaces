package cursor;

public class Shape {
    Point[] vertices;

    public Shape(Point[] vertices) {

        this.vertices = vertices;
    }

    public Point[] getVertices() {

        return vertices;
    }

    public double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }


}

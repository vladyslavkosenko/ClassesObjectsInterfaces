package cursor;

public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public String toString1() {
        return "Point{" +
                "x=" + x +
                ", y=" + y + "z=" + z +
                '}';
    }


}

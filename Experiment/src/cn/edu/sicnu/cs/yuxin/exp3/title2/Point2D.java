package cn.edu.sicnu.cs.yuxin.exp3.title2;

public class Point2D {
    private double x = 0.0, y = 0.0;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean equals(Point2D P) {
        return x == P.getX() && y == P.getY();
    }
}

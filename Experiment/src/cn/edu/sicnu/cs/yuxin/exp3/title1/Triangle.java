package cn.edu.sicnu.cs.yuxin.exp3.title1;

public class Triangle extends Shape2D {
    private double x = 0.0, y = 0.0, z = 0.0;

    public Triangle() {
    }

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double getPerimeter() {
        return x + y + z;
    }

    @Override
    public double getArea() {
        double a = (x + y + z) / 2;
        return Math.sqrt(a * (a - x) * (a - y) * (a - z));
    }
}

package cn.edu.sicnu.cs.yuxin.exp3.title1;

public class Rectangle extends Shape2D {
    private double x = 0.0, y = 0.0;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getPerimeter() {
        return 2 * (x + y);
    }

    @Override
    public double getArea() {
        return x * y;
    }
}

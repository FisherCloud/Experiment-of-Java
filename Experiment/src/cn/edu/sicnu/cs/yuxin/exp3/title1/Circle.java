package cn.edu.sicnu.cs.yuxin.exp3.title1;

public class Circle extends Shape2D {
    private double r = 0.0;
    private final static double PI = 3.1415926;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(r, 2);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}

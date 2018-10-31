package cn.edu.sicnu.cs.yuxin.exp3.title2;

public class Line2D {
    private double a = 0.0, b = 0.0, c = 0.0;

    public Line2D() {
    }

    public Line2D(double k, Point2D point2D) {  //点斜式
        this.a = k;
        this.b = -1;
        this.c = point2D.getY() - point2D.getX() * k;
    }

    public Line2D(Point2D p1, Point2D p2) { //两点式
        if (p1.equals(p2)) {
            System.out.println("两点相等，不能构成一条直线！");
            System.exit(-1);
        } else {
            this.a = p2.getY() - p1.getY();
            this.b = p1.getX() - p2.getX();
            this.c = (p2.getX() - p1.getX()) * p1.getY() - (p2.getY() - p1.getY()) * p1.getX();
        }
    }

    public Line2D(double a, double b) { //一般式
        this.a = b;
        this.b = a;
        this.c = 0 - a * b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public boolean equals(Line2D L) {
        return a == L.getA() && b == L.getB() && c == L.getC();
    }

    public boolean isParallel(Line2D L) {
        return (b / a == L.getB() / L.getA() && c != L.c);
    }
}

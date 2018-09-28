package cn.edu.sicnu.cs.yuxin.exp3.title1;

public class Tile1Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("圆的周长为：" + circle.getPerimeter() + "，面积为：" + circle.getArea());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("三角形的周长为：" + triangle.getPerimeter() + "，面积为：" + triangle.getArea());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("长方形的周长为：" + rectangle.getPerimeter() + "，面积为：" + rectangle.getArea());

        Square square = new Square(5);
        System.out.println("正方形的周长为：" + square.getPerimeter() + "，面积为：" + square.getArea());
    }
}

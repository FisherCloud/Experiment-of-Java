package cn.edu.sicnu.cs.yuxin.exp4.title2;

public class exp4Test2 {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Rectangle rectangle = new Rectangle(1.0, 2.0);
        Square square = new Square(2.0);
        CostCalculator costCalculator = new CostCalculator(2.0, 1.0);
        System.out.printf("%.4f\n", costCalculator.calculator(circle));
        System.out.println(costCalculator.calculator(triangle));
        System.out.println(costCalculator.calculator(rectangle));
        System.out.println(costCalculator.calculator(square));
    }
}

package cn.edu.sicnu.cs.yuxin.exp4.title2;

import cn.edu.sicnu.cs.yuxin.exp3.title1.Shape2D;

public class CostCalculator {
    private Double borderCost;
    private Double solidCost;

    public CostCalculator() {
        this.borderCost = 0.0;
        this.solidCost = 0.0;
    }

    public CostCalculator(Double borderCost, Double solidCost) {
        this.borderCost = borderCost;
        this.solidCost = solidCost;
    }

    public Double calculator(Shape2D shape) {
        return shape.getPerimeter() * this.borderCost + shape.getArea() * solidCost;
    }
}

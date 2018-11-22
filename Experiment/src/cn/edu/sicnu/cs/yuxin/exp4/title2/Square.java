package cn.edu.sicnu.cs.yuxin.exp4.title2;

public class Square extends Rectangle {
    private Double x;

    public Square() {
        this.x = 0.0;
    }

    public Square(Double x) {
        super(x, x);
        this.x = x;
    }
}

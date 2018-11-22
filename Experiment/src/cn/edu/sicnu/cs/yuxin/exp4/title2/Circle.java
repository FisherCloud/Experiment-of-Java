package cn.edu.sicnu.cs.yuxin.exp4.title2;

public class Circle extends cn.edu.sicnu.cs.yuxin.exp3.title1.Circle implements BorderColorable {
    private boolean isPained;

    public Circle() {
        this.isPained = false;
    }

    public Circle(Double r) {
        super(r);
        this.isPained = false;
    }

    @Override
    public void paintBorder() {
        isPained = true;
        System.out.println("已经将圆形的边着色");
    }

    @Override
    public boolean isBorderPained() {
        return isPained;
    }
}

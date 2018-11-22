package cn.edu.sicnu.cs.yuxin.exp4.title2;

public class Rectangle extends cn.edu.sicnu.cs.yuxin.exp3.title1.Rectangle implements BorderColorable, SolidColorable {
    private boolean isBP;
    private boolean isSP;

    public Rectangle() {
        this.isBP = false;
        this.isSP = false;
    }

    public Rectangle(Double x, Double y) {
        super(x, y);
    }

    @Override
    public void paintBorder() {
        isBP = true;
        System.out.println("已经将长方形的边着色");
    }

    @Override
    public boolean isBorderPained() {
        return isBP;
    }

    @Override
    public void paintShape() {
        isSP = true;
        System.out.println("已经将长方形进行着色");
    }

    @Override
    public boolean isShapePainted() {
        return isSP;
    }
}

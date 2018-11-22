package cn.edu.sicnu.cs.yuxin.exp4.title2;

public class Triangle extends cn.edu.sicnu.cs.yuxin.exp3.title1.Triangle implements SolidColorable {
    private boolean isPained;

    public Triangle() {
        this.isPained = false;
    }

    public Triangle(Double x, Double y, Double z) {
        super(x, y, z);
        isPained = false;
    }

    @Override
    public void paintShape() {
        isPained = true;
        System.out.println("已经将三角形进行着色");
    }

    @Override
    public boolean isShapePainted() {
        return isPained;
    }
}

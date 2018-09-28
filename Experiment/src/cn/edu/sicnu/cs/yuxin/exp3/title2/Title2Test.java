package cn.edu.sicnu.cs.yuxin.exp3.title2;

public class Title2Test {
    public static void main(String[] args) {
        Line2D L1 = new Line2D(1, new Point2D(1, 2));
        Line2D L2 = new Line2D(new Point2D(0, -1), new Point2D(1, 0));
        Line2D L3 = new Line2D(-1, 1);

        System.out.println(L1.equals(L2));
        System.out.println(L1.isParallel(L2));
        System.out.println(L1.equals(L3));
    }
}

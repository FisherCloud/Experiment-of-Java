package cn.edu.sicnu.cs.yuxin.exp1;

import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, h;
        System.out.println("请输入梯形的上边长：");
        x = input.nextInt();
        System.out.println("请输入梯形的层数：");
        h = input.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < x + i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}


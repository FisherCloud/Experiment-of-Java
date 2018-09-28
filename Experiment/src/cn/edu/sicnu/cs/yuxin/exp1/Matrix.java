package cn.edu.sicnu.cs.yuxin.exp1;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int x, y, c1[][], c2[][], rst[][];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个矩阵的行数：");
        x = input.nextInt();
        System.out.println("请输入第一个矩阵的列数：");
        y = input.nextInt();
        c1 = new int[x][y];
        System.out.println("请输入该矩阵：");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c1[i][j] = input.nextInt();
            }
        }
        System.out.println("请输入第二一个矩阵的行数：");
        x = input.nextInt();
        System.out.println("请输入第个矩阵的列数：");
        y = input.nextInt();
        c2 = new int[x][y];
        System.out.println("请输入该矩阵：");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c2[i][j] = input.nextInt();
            }
        }
        rst = new int[c1[0].length][c2[0].length];
        rst = matrixmul(c1, c2);
        if (rst == null) {
            System.out.println("这两个矩阵不能进行乘法运算！");
        } else {
            System.out.println("计算结果为：");
            for (int i = 0; i < c1.length; i++) {
                for (int j = 0; j < c2[0].length; j++) {
                    System.out.print(rst[i][j] + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }

    private static int[][] matrixmul(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            return null;
        }
        int c[][] = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}


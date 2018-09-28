package cn.edu.sicnu.cs.yuxin.exp2;

import java.util.Scanner;

public class DoubleConverter {
    public static void main(String[] args) {
        String str;
        System.out.println("请输入一个字符串：");
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        double digital = toDouble(str);
        if (digital != 0) {
            System.out.println(toDouble(str));
        } else {
            System.out.println("输入错误！此字符串不是浮点数！");
        }
    }

    public static double toDouble(String str) {
        boolean flag = false;
        double digital = 0;
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ((ch >= '0' && ch <= '9') || (ch == '.')) {
                if (ch >= '0' && ch <= '9' && !flag) {
                    digital = digital * 10 + ch - '0';
                } else if (flag) {
                    digital = digital * 10 + ch - '0';
                    count++;
                } else {
                    flag = true;
                }
            } else {
                return 0;
            }
        }
        return digital / Math.pow(10, count);
    }
}

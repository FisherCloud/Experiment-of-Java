package cn.edu.sicnu.cs.yuxin.exp1;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        int year;
        double amount, principle, rate;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入您的本金：");
                principle = input.nextDouble();
                if (principle > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("您的输入有误！请重新输入！");
            }
        }
        while (true) {
            try {
                System.out.println("请输入您的存款年限：");
                year = input.nextInt();
                if (year > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("您的输入有误！请重新输入！");
            }
        }
        while (true) {
            try {
                System.out.println("请输入存款利率：");
                rate = input.nextDouble();
                if (rate > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("您的输入有误！请重新输入！");
            }
        }
        amount = principle * Math.pow((1 + rate), year);
        System.out.println(year + "年后您的存款总额为：" + amount + "元，利息为：" + (amount - principle) + "元。");
        input.close();
    }
}


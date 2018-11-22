package cn.edu.sicnu.cs.yuxin.exp5.title1;

import java.util.Scanner;

public class Exp5_Test1 {
    public static void main(String[] args) throws InvalidScoreException {
        Scanner input = new Scanner(System.in);
        int flag = 0;
        do {

            flag = input.nextInt();
        } while (flag != -1);
        input.close();
    }
}

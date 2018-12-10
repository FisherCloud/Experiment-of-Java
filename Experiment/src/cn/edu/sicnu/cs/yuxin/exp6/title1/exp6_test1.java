package cn.edu.sicnu.cs.yuxin.exp6.title1;

import java.util.*;

public class exp6_test1 {
    public static void main(String[] args) {
        int numerator = 0;
        int denominator = 0;
        Random random = new Random(System.currentTimeMillis());
        try {
            List<Rational> rationals = new LinkedList<>();
            for (int i = 0; i < 100; i++) {
                numerator = random.nextInt();
                denominator = random.nextInt();
                rationals.add(new Rational(numerator, denominator));
            }
            for (Object object : rationals) {
                System.out.print(object + ",");
            }
            System.out.println();
            rationals.sort(Rational::compareTo);
            for (Object object : rationals) {
                System.out.print(object + ",");
            }
            System.out.println();
            InverseComparator comparator = new InverseComparator();
            rationals.sort(comparator);
            for (Object object : rationals) {
                System.out.print(object + ",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

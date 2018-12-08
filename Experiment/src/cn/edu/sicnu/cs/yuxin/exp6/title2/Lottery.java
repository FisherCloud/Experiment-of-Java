package cn.edu.sicnu.cs.yuxin.exp6.title2;

import java.util.*;

public class Lottery {
    private int n;
    private int m;
    private Set<Integer> setN = new HashSet<Integer>();
    private Set<Integer> setUserGuess = new HashSet<Integer>();

    public Lottery() {
        this.n = 0;
        this.m = 0;
    }

    public Lottery(int n, int m) {
        if (n >= 3 && n <= 9) {
            this.n = n;
            if (m <= n && m > 0) {
                this.m = m;
                Random random = new Random(System.currentTimeMillis());
                while (setN.size() < n) {
                    setN.add(random.nextInt(10));
                }
            } else {
                System.out.println("参数错误！");
            }
        } else {
            System.out.println("参数错误！");
        }
    }

    public void addGuess() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < setN.size(); i++) {
            System.out.println("请输入第" + (i + 1) + "个猜测的数字：");
            if (!setUserGuess.add(scanner.nextInt())) {
                System.out.println("数字重复，请重新输入：");
                i--;
            }
        }
    }

    public double getAward() {
        System.out.println("随机产生的彩票号为：" + Arrays.toString(setN.toArray()));
        System.out.println("您猜测的彩票号为：" + Arrays.toString(setUserGuess.toArray()));
        if (setN.equals(setUserGuess)) {
            return 100 * Math.pow(8, n);
        } else if (setN.containsAll(setUserGuess)) {
            return Math.pow(6, n);
        } else {
            int count = 0;
            for (Integer integer : setUserGuess) {
                if (setN.contains(integer)) {
                    count++;
                }
            }
            return count >= m ? 100 * Math.pow(2, count) : 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入彩票中需要的数字个数n（必须在3到9之间）：");
        int n = input.nextInt();
        System.out.println("输入彩票中需要匹配的最小数字数m（必须在1到n之间）:");
        int m = input.nextInt();
        Lottery lottery = new Lottery(n, m);
        lottery.addGuess();
        System.out.println("您获得的奖金为：" + lottery.getAward());
    }
}

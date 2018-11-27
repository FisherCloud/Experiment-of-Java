package cn.edu.sicnu.cs.yuxin.exp6.title2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lottery {
    private int n;
    private int m;
    private Set<Integer> setN = new HashSet<Integer>();
    private Set<Integer> setM = new HashSet<Integer>();
    private Set<Integer> setUserGuess = new HashSet<Integer>();

    public Lottery() {
        this.n = 0;
        this.m = 0;
    }

    public Lottery(int n, int m) {
        if (n > 3 && n < 9) {
            this.n = n;
            if (m <= n && m > 0) {
                this.m = m;
            } else {
                System.out.println("参数错误！");
            }
        } else {
            System.out.println("参数错误！");
        }
    }

    public boolean addGuess() {

        return false;
    }

    public boolean getAward() {

        return false;
    }
}

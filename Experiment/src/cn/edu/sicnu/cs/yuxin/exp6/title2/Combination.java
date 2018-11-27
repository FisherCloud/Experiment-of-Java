package cn.edu.sicnu.cs.yuxin.exp6.title2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Combination {
    private Set<Integer> set = new HashSet<Integer>();

    public Set<Integer> getNSet(int n) {
        this.set.clear();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            this.set.add((random.nextInt() % 9) + 3);
        }
        return this.set;
    }

    public Set<Integer> getAllConbination(Set<Integer> collection, int m) {
        this.set.clear();

        return this.set;
    }
}

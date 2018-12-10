package cn.edu.sicnu.cs.yuxin.exp6.title1;

import java.util.Comparator;

public class InverseComparator implements Comparator<Rational> {

    @Override
    public int compare(Rational object1, Rational object2) {
        if (object1.compareTo(object2) > 0) {
            return -1;
        } else if (object1.compareTo(object2) < 0) {
            return 1;
        }
        return 0;
    }

}

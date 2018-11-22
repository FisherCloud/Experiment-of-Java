package cn.edu.sicnu.cs.yuxin.exp6.title1;

public class InverseComparator implements Comparator {

    @Override
    public int compare(Rational object1, Rational object2) throws IllegalRationalException {
        if (object1.compare(object2) > 0) {
            return -1;
        } else if (object1.compare(object2) < 0) {
            return 1;
        }
        return 0;
    }
}

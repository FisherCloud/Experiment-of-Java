package cn.edu.sicnu.cs.yuxin.exp4.title1;

public class ReArrayList implements ReList {
    private int incSize;

    ReArrayList() {
        this.incSize = 5;
    }

    ReArrayList(int incSize) {
        this.incSize = incSize;
    }

    @Override
    public void add(Object obj) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }
}

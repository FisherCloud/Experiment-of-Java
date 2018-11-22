package cn.edu.sicnu.cs.yuxin.exp4.title1;

import java.util.Arrays;
import java.util.Objects;

public class ReArrayList implements ReList {
    private int incSize;            //数组增量
    private Object[] objects;       //定义对象数组

    public ReArrayList() {                 //默认构造函数
        this.incSize = 5;
        this.objects = new Object[this.incSize];
    }

    public ReArrayList(int incSize) {
        if (incSize <= 0) {
            this.incSize = 5;
        } else {
            this.incSize = incSize;
        }
        this.objects = new Object[this.incSize];
    }

    @Override
    public void add(Object obj) {
        for (int i = 0; i < this.objects.length; i++) {
            if (this.objects[i] == null) {
                this.objects[i] = obj;
                System.out.println("An object is added.");
                return;
            }
        }
        this.objects = Arrays.copyOf(this.objects, this.objects.length + this.incSize);
        this.add(obj);
    }

    @Override
    public Object get(int index) {
        if (index >= this.objects.length) {
            System.out.println("index not in the scope!");
            return null;
        }
        return this.objects[index];
    }

    @Override
    public void clear() {
        this.objects = new Object[this.incSize];
        System.out.println("The arrays is cleared.");
    }

    @Override
    public boolean isEmpty() {
        for (Object obj : this.objects) {
            if (obj != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return (int) Arrays.stream(this.objects).filter(Objects::nonNull).count();
    }

    @Override
    public int capacity() {
        return this.objects.length;
    }

    @Override
    public String toString() {
        return "ReArrayList [incSize=" + incSize + ",objects=" + Arrays.toString(this.objects) + "]";
    }

    public Object[] getObjects() {
        return objects;
    }
}

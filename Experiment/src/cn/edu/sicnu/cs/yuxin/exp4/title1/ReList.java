package cn.edu.sicnu.cs.yuxin.exp4.title1;

public interface ReList {
    void add(Object obj);   //往列表尾部添加对象
    Object get(int index);  //从列表中获取索引为i的对象
    void clear();           //清空所有对象
    boolean isEmpty();      //判断列表中是否有对象
    int size();             //获取列表中对象的个数
    int capacity();         //所分配的空间大小
}

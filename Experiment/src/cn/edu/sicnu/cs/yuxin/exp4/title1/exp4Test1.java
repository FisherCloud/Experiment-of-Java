package cn.edu.sicnu.cs.yuxin.exp4.title1;

import cn.edu.sicnu.cs.yuxin.exp4.title1.Person;
import cn.edu.sicnu.cs.yuxin.exp4.title1.ReArrayList;
import cn.edu.sicnu.cs.yuxin.exp4.title1.ReDoubledArrayList;

public class exp4Test1 {
    public static void main(String[] args) {
        ReArrayList reArrayLists = new ReArrayList(3);
        reArrayLists.add(new Person("Allen", 19, "Man"));
        reArrayLists.add(new Person("Bob", 20, "Woman"));
        reArrayLists.add(new Person("City", 21, "Man"));
        System.out.println(reArrayLists.size());
        System.out.println(reArrayLists.capacity());
        reArrayLists.add(new Person("Dicy", 19, "Woman"));
        System.out.println(reArrayLists.size());
        System.out.println(reArrayLists.capacity());
        System.out.println(reArrayLists.get(2));
        System.out.println(reArrayLists.isEmpty());
        System.out.println(reArrayLists.toString());
        reArrayLists.clear();
        System.out.println(reArrayLists.isEmpty());

        ReDoubledArrayList reDoubledArrayList = new ReDoubledArrayList(2);
        reDoubledArrayList.add(new Person("Allen", 19, "Man"));
        reDoubledArrayList.add(new Person("Bob", 20, "Woman"));
        System.out.println(reDoubledArrayList.size());
        System.out.println(reDoubledArrayList.capacity());
        reDoubledArrayList.add(new Person("City", 21, "Man"));
        System.out.println(reDoubledArrayList.size());
        System.out.println(reDoubledArrayList.capacity());
        System.out.println(reDoubledArrayList.get(1));
        System.out.println(reDoubledArrayList.isEmpty());
        System.out.println(reDoubledArrayList.toString());
        reDoubledArrayList.clear();
        System.out.println(reDoubledArrayList.isEmpty());
    }
}

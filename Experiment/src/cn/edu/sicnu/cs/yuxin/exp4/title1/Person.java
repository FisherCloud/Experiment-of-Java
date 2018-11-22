package cn.edu.sicnu.cs.yuxin.exp4.title1;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
        this.name = "";
        this.age = 0;
        this.sex = "";
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "name:" + name + ",age:" + age + ",sex:" + sex;
    }
}

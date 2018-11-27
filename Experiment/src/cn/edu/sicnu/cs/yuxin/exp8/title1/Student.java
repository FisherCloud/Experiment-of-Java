package cn.edu.sicnu.cs.yuxin.exp8.title1;

public class Student {
    private String number;
    private String name;
    private char sex;
    private String birthday;

    Student() {
        this.number = "";
        this.name = "";
        this.sex = '男';
        this.birthday = "";
    }

    Student(String number, String name, char sex, String birthday) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public String getBirthday() {
        return birthday;
    }
}

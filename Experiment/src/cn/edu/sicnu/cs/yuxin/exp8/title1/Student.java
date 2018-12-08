package cn.edu.sicnu.cs.yuxin.exp8.title1;

import cn.edu.sicnu.cs.yuxin.exp8.Mysqldb;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String number;
    private String name;
    private char sex;
    private String birthday;

    Student() {
        this.number = "";
        this.name = "";
        this.sex = '男';
        this.birthday = "1999-01-01";
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

    @Override
    public String toString() {
        return "学号：" + this.number + "姓名：" + this.name + "性别：" + this.sex + "出生日期：" + this.birthday;
    }

    public void printStudentInfo(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        ArrayList<Student> students = new ArrayList<Student>();
        int count = 0;
        String ch = "";
        Scanner input = new Scanner(System.in);
        Mysqldb mysqldb = new Mysqldb();
        System.out.println("请输入学生数量：");
        count = input.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("录入第" + (i + 1) + "个同学的信息");
            System.out.println("请输入学号：");
            student.setNumber(input.nextLine());
            System.out.println("请输入姓名：");
            student.setName(input.nextLine());
            System.out.println("请选择性别（男/女）：");
            student.setSex(input.nextLine().charAt(0));
            System.out.println("请输入出生日期（例：1999-01-01）：");
            student.setBirthday(input.nextLine());
            System.out.println("确认添加？(Y/N)：");
            ch = input.nextLine();
            if (ch.equals("y") || ch.equals("Y")) {
                System.out.println("正在添加学生信息，请稍等......");
                students.add(student);
                //mysqldb.updateByPrepareStatement("insert into student ",);
                System.out.println("添加成功！");
            } else {
                System.out.println("你已取消添加当前学生信息，请重新添加！");
                i--;
            }
            student.setSex('男');
            student.setNumber("");
            student.setName("");
            student.setBirthday("1999-01-01");
        }
        student.printStudentInfo(students);
        input.close();
        students.clear();
    }
}

package cn.edu.sicnu.cs.yuxin.exp3.title3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int id, nCourse;
    private String name;
    private ArrayList<Course> courses;

    public Student() {
    }

    public Student(int id, String name, int nCourse) {
        this.id = id;
        this.name = name;
        this.nCourse = nCourse;
        Scanner input = new Scanner(System.in);
        int iid;
        String iname;
        int icredit;
        double grade;
        boolean slowTest;
        try {
            for (int i = 0; i < nCourse; i++) {
                System.out.println("请输入第" + (1 + 1) + "科科目编号:");
                iid = input.nextInt();
                System.out.println("请输入科目编号为" + iid + "的名称：");
                iname = input.nextLine();
                System.out.println("请输入科目名称为" + iname + "的学分：");
                icredit = input.nextInt();
                System.out.println("请输入科目名称为" + iname + "的成绩：");
                grade = input.nextDouble();
                System.out.println("设置输入科目名称为" + iname + "是否缓考？（是：1/否:0）");
                slowTest = input.nextInt() == 1;
                Course course = new Course(iid, iname, icredit);
                course.setGrade(grade);
                course.setSlowTest(slowTest);
                courses.add(course);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public double calculateWeightedGrade() {
        double grades = 0.0;
        double credits = 0.0;
        for (Course course : courses) {
            if (!course.isSlowTest()) {
                grades += course.getGrade() * course.getCredit();
                credits += course.getCredit();
            }
        }
        return grades / credits;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "，学号：" + id;
    }

    public void printStudentInfo() {
        System.out.println(toString());
        for (Course course : courses) {
            System.out.println(course.toString());
        }
    }
}

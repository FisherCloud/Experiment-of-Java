package cn.edu.sicnu.cs.yuxin.exp3.title3;

import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    private int nStudent = 0;
    private ArrayList<Student> students;

    public Class() {
    }

    public Class(int nStudent) {
        this.nStudent = nStudent;
        Scanner input = new Scanner(System.in);
        int id;
        String name;
        int n;
        for (int i = 0; i < nStudent; i++) {
            System.out.println("请输入第" + (1 + 1) + "个学生的学号:");
            id = input.nextInt();
            System.out.println("请输入学生学号为" + id + "的姓名：");
            name = input.nextLine();
            System.out.println("请输入学生学号为" + id + "的科目数量：");
            n = input.nextInt();
            addStudent(new Student(id, name, n));
        }
    }

    public void addStudent(Student student) {
        nStudent += 1;
        students.add(student);
    }

    public double calculateWeightedGrade() {
        double grades = 0.0;
        for (Student student : students) {
            grades += student.calculateWeightedGrade();
        }
        return grades;
    }

    @Override
    public String toString() {
        return "学生数量：" + "，学生加权成绩：" + calculateWeightedGrade();
    }
}

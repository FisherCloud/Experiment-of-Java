package cn.edu.sicnu.cs.yuxin.exp5.title1;

import cn.edu.sicnu.cs.yuxin.exp4.title1.ReArrayList;

import java.util.Arrays;

public class StudentGradeList extends ReArrayList {
    public StudentGradeList() {
        super();
    }

    public StudentGradeList(int incSize) {
        super(incSize);
    }

    public double calculateAverageGrade() {
        double sumScore = 0.0;
        int count = 1;

        return sumScore / count;
    }

    public double calculatePassRate() {
        return 0.0;
    }

    public void printStudentGradeInfo() {
        for (Object object : getObjects()) {
            System.out.println(object.toString());
        }
    }

}

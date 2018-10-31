package cn.edu.sicnu.cs.yuxin.exp3.title3;

import java.security.PublicKey;

public class Class {
    private int nStudent = 0;
    private Student[] students = null;

    public Class() {
    }

    public Class(int nStudent) {
        this.nStudent = nStudent;
    }

    public void addStudent(Student student) {
        nStudent += 1;

    }

    public double calculateWeightedGrade() {

        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

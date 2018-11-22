package cn.edu.sicnu.cs.yuxin.exp5.title1;

public class StudentGrade {
    private String name;
    private double grade;

    public StudentGrade() {
        this.name = "";
        this.grade = 0.0;
    }

    public StudentGrade(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return getName() + "\t" + getName();
    }
}

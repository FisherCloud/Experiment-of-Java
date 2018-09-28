package cn.edu.sicnu.cs.yuxin.exp3.title3;

public class Course {
    private int id = 0, credit = 0;
    private String name;
    private double grade = 0.0;
    private boolean slowTest = false;

    public Course() {
    }

    public Course(int id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setSlowTest(boolean slowTest) {
        this.slowTest = slowTest;
    }

    @Override
    public String toString() {
        return "ID:" + id + ",name:" + name + ",credit:" + credit + ",grade:" + grade + ",slowtest:" + slowTest;
    }
}

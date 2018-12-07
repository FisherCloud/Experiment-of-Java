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

    public double getGrade() {
        return grade;
    }

    public boolean isSlowTest() {
        return slowTest;
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
        return "课程编号：" + id + "，课程名称：" + name + "，课程学分：" + credit + "，成绩：" + grade + "，是否缓考：" + (slowTest ? "是" : "否");
    }
}

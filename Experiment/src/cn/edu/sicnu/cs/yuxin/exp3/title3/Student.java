package cn.edu.sicnu.cs.yuxin.exp3.title3;

public class Student {
    private int id, nCourse;
    private String name;
    private Course[] courses = null;

    public Student() {
    }

    public Student(int id, String name, int nCourse) {
        this.id = id;
        this.name = name;
        this.nCourse = nCourse;
        this.courses = new Course[nCourse];
    }

    public void addCourse(Course course) {

    }

    public double calculateWeightedGrade() {

        return 0.0;
    }

    @Override
    public String toString() {
        return " ";
    }

    public void printStudentInfo() {

    }
}

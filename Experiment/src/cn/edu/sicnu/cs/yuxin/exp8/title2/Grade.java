package cn.edu.sicnu.cs.yuxin.exp8.title2;

public class Grade {
    private String number;
    private String cNumber;
    private int grade;

    Grade() {

    }

    Grade(String number, String cNumber, int grade) {
        this.number = number;
        this.cNumber = cNumber;
        this.grade = grade;
    }

    public String getNumber() {
        return number;
    }

    public String getcNumber() {
        return cNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

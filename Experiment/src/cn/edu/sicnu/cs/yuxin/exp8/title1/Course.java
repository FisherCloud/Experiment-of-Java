package cn.edu.sicnu.cs.yuxin.exp8.title1;

public class Course {
    private String cNumber;
    private String cName;
    private short cCredit;

    Course() {
        this.cNumber = "";
        this.cName = "";
    }

    public Course(String cNumber, String cName, short cCredit) {
        this.cNumber = cNumber;
        this.cName = cName;
        this.cCredit = cCredit;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcCredit(short cCredit) {
        this.cCredit = cCredit;
    }

    public String getcNumber() {
        return cNumber;
    }

    public String getcName() {
        return cName;
    }

    public short getcCredit() {
        return cCredit;
    }
}

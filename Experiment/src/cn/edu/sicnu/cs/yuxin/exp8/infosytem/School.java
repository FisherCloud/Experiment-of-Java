package cn.edu.sicnu.cs.yuxin.exp8.infosytem;

public class School {
    private char[] identificationCode;
    private String name = "";
    private boolean state = false;

    public School() {
        identificationCode = new char[10];
        name = "";
    }

    public School(char[] identificationCode, String name, boolean state) {
        this.identificationCode = identificationCode;
        this.name = name;
        this.state = state;
    }

    public void setIdentificationCode(char[] identificationCode) {
        this.identificationCode = identificationCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public char[] getIdentificationCode() {
        return identificationCode;
    }

    public String getName() {
        return name;
    }

    public boolean getState() {
        return state;
    }

    @Override
    public String toString() {
        return "学院代码：" + String.valueOf(identificationCode) + "，学院名称：" + name + "学院状态：" + state;
    }
}

package cn.edu.sicnu.cs.yuxin.exp8.infosytem;

import java.util.Arrays;

public class School {
    private char[] identificationCode;
    private String name = "";

    public School() {
        identificationCode = new char[10];
        name = "";
    }

    public School(char[] identificationCode, String name) {
        this.identificationCode = identificationCode;
        this.name = name;
    }

    public void setIdentificationCode(char[] identificationCode) {
        this.identificationCode = identificationCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getIdentificationCode() {
        return identificationCode;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "学校代码：" + Arrays.toString(identificationCode) + "，学校名称：" + name;
    }
}

package cn.edu.sicnu.cs.yuxin.exp5.title1;

public class InvalidScoreException extends Exception {
    private double value;
    private int count;

    public InvalidScoreException() {
        super();
    }

    public InvalidScoreException(String msg, double value) {
        super(msg);
        this.value = value;
    }

    public InvalidScoreException(String msg, int count){
        super(msg);
        this.count=count;
    }

    public double getValue() {
        return value;
    }

    public int getCount() {
        return count;
    }
}

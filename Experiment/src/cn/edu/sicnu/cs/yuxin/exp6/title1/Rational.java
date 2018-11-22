package cn.edu.sicnu.cs.yuxin.exp6.title1;

class IllegalRationalException extends Exception {
    public IllegalRationalException() {
        super("分子分母同时为零");
    }
}

public abstract class Rational implements Comparable {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int compare(Rational object) throws IllegalRationalException {
        if (this.numerator == 0 && this.denominator == 0) {
            throw new IllegalRationalException();
        }
        if (this.numerator * object.denominator > this.denominator * object.numerator) {
            return 1;
        } else if (this.numerator * object.denominator < this.denominator * object.numerator) {
            return -1;
        }
        return 0;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

}



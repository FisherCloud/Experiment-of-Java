package cn.edu.sicnu.cs.yuxin.exp6.title1;

import java.lang.Comparable;

class IllegalRationalException extends Exception {
    public IllegalRationalException() {
        super("分子分母同时为零");
    }
}

public class Rational implements Comparable<Rational> {
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

    @Override
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

    @Override
    public int compareTo(Rational rational) {
        if (this.numerator == 0 && rational.denominator == 0) {
            try {
                throw new IllegalRationalException();
            } catch (IllegalRationalException e) {
                e.printStackTrace();
            }
        }
        if (this.numerator * rational.denominator > this.denominator * rational.numerator) {
            return 1;
        } else if (this.numerator * rational.denominator < this.denominator * rational.numerator) {
            return -1;
        }
        return 0;
    }
}



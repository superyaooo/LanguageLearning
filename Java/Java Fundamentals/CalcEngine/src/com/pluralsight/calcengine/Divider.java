package com.pluralsight.calcengine;

/**
 * Created by yaowang on 1/15/17.
 */
public class Divider extends CalculateBase {
    public Divider() {}
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}

package com.pluralsight.calcengine;

/**
 * Created by yaowang on 1/24/17.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyWord();   // add
    char getSymbol();   // +
    double doCalculation(double leftVal, double rightVal);
}



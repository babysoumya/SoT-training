package com.pluralsight.Organized2;

public interface MathProcessing {

    String SEPARATOR=" ";
    String getKeyword();
    double doCalculation(double leftVal,double rightVal);
    default String getFormattedOutput()
    {
        return null;
    }


}

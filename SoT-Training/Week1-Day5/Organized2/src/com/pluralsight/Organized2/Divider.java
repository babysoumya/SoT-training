package com.pluralsight.Organized2;

public class Divider extends CalculateBase{
    public Divider(){}

    public Divider(double leftVal,double rightVal)
    {
        super(leftVal,rightVal);
    }
    public void calculate()
    {
        double val=getLeftVal()/getRightVal();
        setResult(val);
    }
}

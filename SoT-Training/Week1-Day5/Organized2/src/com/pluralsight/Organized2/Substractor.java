package com.pluralsight.Organized2;

public class Substractor extends CalculateBase  {

    public Substractor(){}

    public Substractor(double leftVal,double rightVal)
    {
        super(leftVal,rightVal);
    }
   @Override
    public void calculate()
    {
        double val=getLeftVal()-getRightVal();
        setResult(val);
    }
}

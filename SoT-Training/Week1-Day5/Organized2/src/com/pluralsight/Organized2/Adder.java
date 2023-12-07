package com.pluralsight.Organized2;

public class Adder extends CalculateBase implements MathProcessing{

    public Adder(){}

    public Adder(double leftVal,double rightVal)
    {
        super(leftVal,rightVal);
    }
    @Override
    public void calculate()
    {
        double val=getRightVal()+getLeftVal();
        setResult(val);
    }


    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}

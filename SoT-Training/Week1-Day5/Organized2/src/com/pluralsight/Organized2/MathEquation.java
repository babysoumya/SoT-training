package com.pluralsight.Organized2;

import java.util.ResourceBundle;

public class MathEquation {

     private double leftVal ;
   private  double rightVal;
    private char opCode;
   private double result;

   private static int numOfCalc;
   private static double sumOfResults;

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;

    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    MathEquation (char Opcode) {
        this.opCode = opCode;
    }
    public MathEquation(double leftVal,double rightVal,char opCode) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    void execute()
    {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        numOfCalc++;
        sumOfResults+=result;
    }
    public static double getAvgResult()
    {
        return sumOfResults/numOfCalc;
    }
}

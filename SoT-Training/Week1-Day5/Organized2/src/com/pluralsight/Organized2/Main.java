package com.pluralsight.Organized2;

import java.time.LocalDate;
import java.util.Scanner;



public class Main {



        public static void main(String[] args) {
          //  performCalculations();
            /*
            Divider d=new Divider();
            doCalculation(d,100.0d,50.0d);
            Adder a=new Adder();
            doCalculation(a,100.0d,50.0d);
            performMoreCalculations();

             */
           // executeInteractively();
            dynamicInteractivity();
        }

    private static void dynamicInteractivity() {
            DynamicHelper helper=new DynamicHelper(new MathProcessing[]
                    {
                       new Adder(),
                            new PowerOf()
                    });

        System.out.println("Enter an Operation and two numbers:");
        Scanner scanner=new Scanner(System.in);
        String userInput=scanner.nextLine();
        helper.process(userInput);
    }

    private static void performMoreCalculations() {
            CalculateBase[] calculations={
                    new Divider(100.0d,50.0d),
        new Adder(100.0d,50.0d),
        new Substractor(100.0d,50.0d),
        new Multiplier(100.0d,50.0d)
            };

            System.out.println();
            System.out.print("Array Calculations");
            for(CalculateBase cb:calculations)
            {
                cb.calculate();
                System.out.println("Result= "+cb.getResult());
            }
    }

    private static CalculateBase createCalculation(MathOperation opn, double leftVal,double rightVal)
    {
        CalculateBase calculation =null;
        switch (opn)
        {
            case ADD:
                calculation =new Adder(leftVal,rightVal);
                break;
            case SUBTRACT:
                calculation =new Substractor(leftVal,rightVal);
                break;
            case MULTIPLY:
                calculation =new Multiplier(leftVal,rightVal);
                break;
            case DIVIDE:
                calculation=new Divider(leftVal,rightVal);
                break;
        }
        return calculation;
    }

    static void executeInteractively()
    {
        System.out.println("Enter an Operation and two numnbers:");
       Scanner scanner=new Scanner(System.in);
       String userInput=scanner.nextLine();
       String[] parts=userInput.split(" ");
       performOperation(parts);
    }

    private static void performOperation(String[] parts)
    {
        MathOperation opn=MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal=Double.parseDouble(parts[1]);
        double rightVal=Double.parseDouble(parts[2]);
        CalculateBase calculation=createCalculation(opn,leftVal,rightVal);
        calculation.calculate();
        System.out.println("Operation Performed: "+opn);
        System.out.println(calculation.getResult());

    }



    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal)
        {
            calculation.setLeftVal(leftVal);
            calculation.setRightVal(rightVal);
            calculation.calculate();
            System.out.println("Calculation Result: "+calculation.getResult());
        }
        static void performCalculations() {


            MathEquation[] equations=new MathEquation[4];

            equations[0]=new MathEquation(100.0,50.0d,'d');
            equations[1]=new MathEquation(25.0,92.0,'a');
            equations[2]=new MathEquation(225.0,17.0,'s');
            equations[3]=new MathEquation(11.0,3.0,'m');

            for(MathEquation e:equations)
            {
                e.execute();
                System.out.println("result = "+e.getResult());
            }
            System.out.println("Average result: " + MathEquation.getAvgResult());

        }



}




















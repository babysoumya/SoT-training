package com.pluralsight.Organized2;


public class DynamicHelper {
    private final MathProcessing[]handlers;
    public DynamicHelper(MathProcessing[] handlers)
    {
        this.handlers=handlers;
    }
    public void process(String statement)
    {
        String[] parts=statement.split(MathProcessing.SEPARATOR);
        String keyword=parts[0];
        double leftVal=Double.parseDouble(parts[1]);
        double rightVal=Double.parseDouble(parts[2]);

        MathProcessing theHandler=null;
        for(MathProcessing h:handlers)
        {
            if(keyword.equalsIgnoreCase(h.getKeyword()))
            {
                theHandler=h;
                break;
            }
        }
        double result= theHandler.doCalculation(leftVal,rightVal);
        System.out.println("Result: "+result);

    }


}

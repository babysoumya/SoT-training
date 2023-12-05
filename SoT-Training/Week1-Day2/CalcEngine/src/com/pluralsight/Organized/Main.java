package com.pluralsight.Organized;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

//StringBuilder sb=new StringBuilder(40);

/*
  int w=5;
        int x=235;
        String s=String.format("W:%d X=%d",w,x);
       s=String.format("W:%4d X=%4d",w,x);
        s=String.format("W:%04d X=%04d",w,x);
        s=String.format("W:%-4d X=%-4d",w,x);
        int ival=1234567;
        double val=1234567.0d;
        s=String.format("%,d",ival);//1,234,567
        s=String.format("%,.2f",val);//1,234,567.00

        int i1=123;
        int i2=-456;
         s=String.format("% d",i1);// 123
         s=String.format("% d",i2);//-456
         s=String.format("%+d",i1);//display sign
         s=String.format("%(d",i1);//(456)->negative values in parenthesis
         //to align them
         s=String.format("% (d",i1);// 123
         s=String.format("%(d",i2); //(456)
         int v1=100;
         int v2=200;
         int v3=300;
         s1=String.format("%3$d %1$d %2$d",v1,v2,v3);// 300 100 200
         s2=String.format("%2$d %<d %1$d",v1,v2,v3);//200 200 100
//< takes value of before

LocalDate today=LocalDate.now();
Syetem.out.println(today);

DateTimeFormatter usDateFormat= DateTimeFormatter.ofPattern("MM-dd-yyyy");
System.out.println(today.format(usDateFormat));
////////////////orrrrr
DateTimeFormatter usDateFormat= DateTimeFormatter.ofPattern("MM-dd-YYYY");
LocalDate theDate=LocalDate.parse(usDateString,usDateFormat);
 */

public class Main {
    static int execute(char ch, int leftval, int rightval) {
        int result = 0;


        switch (ch) {
            case 'a':
                result = leftval + rightval;
                break;
            case 's':
                result = leftval - rightval;
                break;
            case 'm':
                result = leftval * rightval;
                break;
            case 'd': {
                if (rightval != 0)
                    result = leftval / rightval;
                break;
            }
            default:
                System.out.println("Invalid opcode" + ch);
                result = 0;
                break;

        }
        return result;
    }

    public static void main(String[] args) {

        int[] leftval = {100, 25, 225, 11};
        int[] rightval = {50, 92, 17, 3};
        char[] ch = {'d', 'a', 's', 'm'};
        int[] results = new int[ch.length];
        if (args.length == 0) {
            for (int i = 0; i < ch.length; i++) {
                results[i] = execute(ch[i], leftval[i], rightval[i]);

            }
            for (int it : results)

                System.out.println(it);
        }
        else if(args.length==1 && args[0].equals("interactive"))
            executeInteractively();
        else if (args.length == 3) {
            handleCommandline(args);
        } else
            System.out.println("Please provide an opt code and 2 values");


    }

    static void executeInteractively() {
        System.out.println("Enter an operation and two values");
        Scanner scanner = new Scanner(System.in);
        String userinput = scanner.nextLine();
        String[] parts = userinput.split(" ");
        performOpn(parts);


    }

    private static void performOpn(String[] parts) {
        char opcode=opcodeFromstring(parts[0]);
        /****Date*****/
        if(opcode=='w')
            handlewhen(parts);
        else {
            int leftval = valfromword(parts[1]);
            int rightval = valfromword(parts[2]);
            int result = execute(opcode, leftval, rightval);
            displayResult(opcode, leftval, rightval, result);
        }
    }

    private static void handlewhen(String[] parts) {
        LocalDate startDate=LocalDate.parse(parts[1]);
        long daysToAdd=(long)valfromword(parts[2]);
        LocalDate newDate=startDate.plusDays(daysToAdd);
        String output=String.format("%s plus %d days is %s",startDate,daysToAdd,newDate);
        System.out.println(output);
    }

    private static void displayResult(char opcode, int leftval, int rightval, int result) {
        char symbol = symbolFromOpcode(opcode);

        /*
        StringBuilder b=new StringBuilder(20);
        b.append(leftval);
        b.append(" ");
        b.append(symbol);
        b.append(" ");
        b.append(rightval);
        b.append(" = ");
        b.append(result);
        String output=b.toString();
        System.out.println(output);

         */
        String output=String.format("%d %c %d = %d",leftval,symbol,rightval,result);
        System.out.println(output);
    }


    private static char symbolFromOpcode(char opcode)
    {
        char[] opcodes={'a','s','m','d'};
        char[] symbols={'+','-','*','/'};

        char symbol=' ';
        for(int i=0;i<opcodes.length;i++)
        {
            if(opcode==opcodes[i])
            {
                symbol=symbols[i];
                break;
            }
        }
        return symbol;
    }

    private static void handleCommandline(String[] args) {
       /*Scanner in=new Scanner(System.in);
       String s=in.nextLine();
       int a=in.nextInt();
       float b=in.nextFloat();
        */
        char ch = args[0].charAt(0);
        int leftval = Integer.parseInt(args[1]);
        int rightval = Integer.parseInt(args[2]);
        int result = execute(ch, leftval, rightval);
        System.out.println(result);
    }

    static char opcodeFromstring(String opname) {
        char opcode = opname.charAt(0);
        return opcode;
    }

    static int valfromword(String word) {
        String[] numberwords = {"zero", "one", "two", "three", "four", "five", "six"
                , "seven", "eight", "nine"};
        int val = -1;
        for (int i = 0; i < numberwords.length; i++) {
            if (word.equals(numberwords[i])) {
                val = i;
                break;
            }
        }
        if(val==-1)
        {
            val=Integer.parseInt(word);
        }
        return val;
    }
    /*
    static void checkRelationship(Instant otherInstant)
    {
        Instant nowInsstant =Instant.now();
        if(otherInstant.compareTo(nowInsstant)>0)
        {
            System.out.println("Instant is in the future");
        }
        else if(otherInstant.compareTo(nowInsstant)<0)
        {
            System.out.println("Instant is in the past");
        }
    }

     */
}
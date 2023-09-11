package calc;

//plans: a simple calculator with a simple interface.
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
            interfaceDisplayPage1();

            System.out.println("Pick an operation. You may write the operation you'd like "
                                + "as they're shown on their icons or enter "
                                + "a related word");

            Scanner calcRequest = new Scanner(System.in);
            String calcFunction = calcRequest.nextLine();

            switch(calcFunction) {

                case "+": case "addition": case "add":
                System.out.println("Addition: Enter two real numbers separated by a space.");
                Scanner addRequest = new Scanner(System.in);
                double num1 = addRequest.nextDouble();
                double num2 = addRequest.nextDouble();

                System.out.println(additionOp(num1, num2));

            }


    }// end Main

    public static void interfaceDisplayPage1() {
        char plusSign = '+';
        char minusSign = '-';
        char multSign =  'x';
        char divSign = '/';
        char sqrtSign = '√';
        char powrSign = '^';
        String logSign = "logb(a)";
        String sinSign = "sin(x)";
        String cosSign = "cos(x)";

        System.out.printf("| |\t%1c\t| |\t%1c\t| |\t%1c\t| |\n", plusSign, minusSign, multSign);
        System.out.printf("| |\t  \t| |\t  \t| |\t  \t| |\n");
        System.out.printf("======================================================\n");
        System.out.printf("| |\t%1c\t| |\t%1c\t| |\t%1c\t| |\n", divSign, sqrtSign, powrSign);
        System.out.printf("| |\t  \t| |\t  \t| |\t  \t| |\n");
        System.out.printf("======================================================\n");
        System.out.printf("| |\t%1s\t| |\t%1s\t| |\t%1s\t| |\n", logSign, sinSign, cosSign);
        System.out.printf("| |\t  \t| |\t  \t| |\t  \t| |\n");
    

    }// end interfaceDisplayPage1();

    public static double additionOp(double a, double b) {
        
        return a + b;

    }//end of additionOp

    public static double subtractOp(double a, double b) {

        return a - b;

    }// end of subtraction

    public static double multOp(double a, double b) {

        return a * b;

    }//end of multOp

    public static double divOp(double a, double b) {

        return a / b;

    }// end divOp

    public static double sqrtOp(double a) {

        return Math.sqrt(a);

    }//end sqrtOp

    public static double expnOp(double a, double b) {
            
        return Math.pow(a, b);

    }// end expnOp

    public static double logOp(double a, double b) {

        if(a == 10) {
            return Math.log(b);

        } else {
            return Math.log(b) / Math.log(a);

        }//if statement computes logs with base 10, else statement
         //computes all other bases by converting to base 10

    }//end logOp

    public static double sinOp(double a) {
        return Math.sin(a);

    }//end sinOp

    public static double cosOp(double a) {
        return Math.cos(a);

    }//end cosOp



}// end class Calculator
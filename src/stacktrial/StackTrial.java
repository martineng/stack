/*
   This is the basic program to use Stack
 */
package stacktrial;

import java.util.Scanner; // Get the input

/**
 @author martineca
 */
public class StackTrial
{
   
    public static void main(String[] args)
    {   
        Scanner inputReader = new Scanner(System.in);
        String myString;
        TheStack stack01 = new TheStack();
        
        try
        {
            do
            {
                System.out.print("Please enter the " + (stack01.getTop() + 1) + " strings\n");
                myString = inputReader.next();
                stack01.push(myString);
            } while (!(stack01.isFull()));

            System.out.print("\nThe top is: " + stack01.getTop() + "\n");
            System.out.print("The top item is : " + stack01.peek() + "\n\n");

            System.out.print("Removing the top item\n");
            stack01.pop();

            System.out.print("The top is: " + stack01.getTop() + "\n");
            System.out.print("The top item is now: " + stack01.peek() + "\n\n");

            System.out.print("Sum of String: " + stack01.outTotalStringAccending() + "\n");
            System.out.print("Reverse of Sum of String: " + stack01.outTotalStringDeccending() + "\n");
        }// END try
        catch (Exception exceptionMsg)
        {
            System.err.println(exceptionMsg);
        }// END catch
    }// END main
    
}// END class

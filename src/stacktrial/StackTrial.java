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
    static String[] stackArray = new String[10];
    static int top = 0, maxSize = 10;
    
    
    public static void main(String[] args)
    {   
        Scanner inputReader = new Scanner(System.in);
        String myString;
        
        do
        {
            System.out.print("Please enter the " + (top + 1) + " strings\n");
            myString = inputReader.next();
            push(myString);
        } while (!(isFull()));
        
        System.out.print("\nThe top is: " + top + "\n");
        System.out.print("The top item is : " + peek() + "\n\n");
        
        System.out.print("Removing the top item\n");
        pop();
        
        System.out.print("The top is: " + top + "\n");
        System.out.print("The top item is now: " + peek() + "\n");
        
    }
    
    // Insert the object at the top
    public static void push(String inString)
    {
        stackArray[++top] = inString;
    }
    
    //Take item from the top
    public static String pop()
    {
        return stackArray[top--];
    }
    
    //Peek at the top stack
    public static String peek()
    {
        return stackArray[top];
    }
    
    // true if stack is empty
    public static boolean isEmpty()
    {
        return (top == -1);
    }
    
    // true if stack is full
    public static boolean isFull()
    {
        return (top == maxSize - 1);
    }
    
}

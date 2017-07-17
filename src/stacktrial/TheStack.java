/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacktrial;

/**
 @author martineca
 */
public class TheStack
{
    String[] stackArray = new String[10];
    int top = 0, maxSize = 10;
    
    // Constructor
    public TheStack()
    {
       //Null Constructor
    }
    
       // Insert the object at the top
    public void push(String inString)
    {
        stackArray[++top] = inString;
    }
    
    //Take item from the top
    public String pop()
    {
        return stackArray[top--];
    }
    
    //Peek at the top stack
    public String peek()
    {
        return stackArray[top];
    }
    
    // true if stack is empty
    public boolean isEmpty()
    {
        return (top == -1);
    }
    
    // true if stack is full
    public boolean isFull()
    {
        return (top == maxSize - 1);
    }
    
    public int getTop()
    {
        return top;
    }
    
    // Output a single string with everything 
    public String outTotalStringAccending()
    {
        String outString = "";
        
        for (int counter = 1;counter <= getTop(); counter++)
        {
            outString = outString + stackArray[counter];
        }
        
        return outString;
    }
    
    //Output a single string in reverse order
    public String outTotalStringDeccending()
    {
        String outString = "";
        
        for (int counter = getTop(); counter != 0; counter--)
        {
            outString = outString + stackArray[counter];
        }
        
        return outString;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodarguments;

import java.util.Arrays;
import static java.util.Arrays.asList;

/**
 *
 * @author SOLTAYLO
 */
public class MethodArguments {
    public double result;
    public double leftVal;
    public double rightVal;
    
    /**
     * @param args the command line arguments
     */
    static String[] elements = {"zero","one","two","three","four","five",
                             "six","seven","eight","nine","ten"};
    public static void main(String[] args) {
        String val1= "four";
        String val2= "five";
        
        
        
        
        MethodArguments methodArgument = new MethodArguments();
        methodArgument.addUp(val1,val2);
        System.out.print("result = ");  
        System.out.println(methodArgument.getResult());
    
}
    //creating a overload instance of the execute method in order to handle
    //initialization and setting of the variables that will be executed
    //this is in the event a double is passed through
    public void addUp(double leftVal, double rightVal){
        //sum the left and right values that are passed through to it
        
        result = leftVal + rightVal;
    }
    
    //creating a overload instance of the execute method in order to handle
    //initialization and setting of the variables that will be executed
    //this is in the event an integer is passed through
    public void addUp(int leftVal, int rightVal) {
        //sum the left and right values that are passed through to it
        result = leftVal + rightVal;
    }

    //creating a overload instance of the execute method in order to handle
    //initialization and setting of the variables that will be executed
    //this is in the event a string is passed through
    public void addUp(String leftVal, String rightVal) {
        //this will check the value passed through to the method against the 
        //values located in the elements and determine if that value is present
        //in the array
        if(Arrays.asList(elements).contains(leftVal) 
                && Arrays.asList(elements).contains(rightVal))
        result = Arrays.asList(elements).indexOf(leftVal)+
                Arrays.asList(elements).indexOf(rightVal);
        
        
        else
            System.out.println("Error - incorrect input value.");
    }
    
    //to use a value as read only; do not include a mutator 
    //command within the accessor; create an accessor for results
    public double getResult(){return result;}
    
    
}
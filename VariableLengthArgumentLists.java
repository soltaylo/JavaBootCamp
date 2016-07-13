/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablelengthargumentlists;

import java.util.Arrays;

/**
 *
 * @author SOLTAYLO
 */
public class VariableLengthArgumentLists {
    public double result;
    public double leftVal;
    public double rightVal;
    /**
     * @param args the command line arguments
     */
    
     static String[] elements = {"zero","one","two","three","four","five",
                             "six","seven","eight","nine","ten"};
    
    public static void main(String[] args) {
        String val1= "one";
        String val2= "five";
        
        
        
        
        VariableLengthArgumentLists methodArgumentLists = new VariableLengthArgumentLists();
        methodArgumentLists.addUp(val1,val2);
        System.out.print("result = ");  
        System.out.println(methodArgumentLists.getResult());
    
    }
    
    //creating a overload instance of the execute method in order to handle
    //initialization and setting of the variables that will be executed
    //this is in the event a double is passed through
    public void addUp(double... list){
        //loops through the list array and sums the values up
        for  (int i=0;i<list.length;i++){
            result += list[i];
        }        
    }
    
    //creating a overload instance of the execute method in order to handle
    //initialization and setting of the variables that will be executed
    //this is in the event an integer is passed through
    public void addUp(int... list) {
        //loops through the list array and sums the values up
        for  (int i=0;i<list.length;i++){
            result += list[i];
        }        
    }

    //creating a overload instance of the execute method in order to handle
    //initialization and setting of the variables that will be executed
    //this is in the event a string is passed through
    public void addUp(String... list) {
        //this will check the value passed through to the method against the 
        //values located in the elements and determine if that value is present
        //in the array
        
        //loops through the list array and sums the values up; also checks to
        //see if 
    
            if(Arrays.asList(elements).contains(list[0]) 
                && Arrays.asList(elements).contains(list[1]))
                result = Arrays.asList(elements).indexOf(list[0])+
                Arrays.asList(elements).indexOf(list[1]);
            else
                System.out.println("Error - incorrect input value.");
       
    }
    
    //to use a value as read only; do not include a mutator 
    //command within the accessor; create an accessor for results
    public double getResult(){return result;}
    
}

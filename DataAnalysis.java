/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalysis;
//activate the user input capabilities
import java.util.Scanner;
/**
 *
 * @author SOLTAYLO
 */
public class DataAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //initiate new scanner utility to allow for user input
        Scanner userInputScanner = new Scanner(System.in);
        //ask the user to input the array size they wish to declare
        System.out.println("Please declare the size of your array.");
        int arraySize = userInputScanner.nextInt(); 
        //int arraySize = 2;
        //creates an array based on the size the user has declared
        int [] dataArray = new int[arraySize];
        //this for statement handles getting values from user to input into the
        //array
        double meanVal = 0, minVal = 0, maxVal = 0, meanSum = 0;
        
        
        for (int i=0; i < dataArray.length; i++){
            System.out.println("Please enter the value you wish to place in"
                    + " array space " + i + " below, and click enter to "
                    + "continue");
            dataArray[i] = userInputScanner.nextInt();
        }
        //calculates the mean of the array
        for (int i = 0; i < dataArray.length; i++) {
            meanSum += dataArray[i];
        }
        meanVal = meanSum / dataArray.length;
        //identifies the min value in the array
        minVal = dataArray[0];
        for (int i = 0; i < dataArray.length; i++) {
            if(dataArray[i] < minVal){  
                minVal = dataArray[i];
            }
        }
        //identifies the max value in the array
        maxVal = dataArray[0];
        for (int i = 0; i < dataArray.length; i++) {
            if(dataArray[i] > maxVal){  
                maxVal = dataArray[i];
            }
        }
        
        System.out.println("The mean of your array is " + meanVal);
        System.out.println("The smallest value in your array is " + minVal);
        System.out.println("The largest value in your array is " + maxVal);
        
    }
    
}

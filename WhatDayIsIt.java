/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatdayisit;
//activate the user input capabilities
import java.util.Scanner;
/**
 *
 * @author SOLTAYLO
 */
public class WhatDayIsIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initiate new scanner utility to allow for user input
        Scanner userInputScanner = new Scanner(System.in);
        
        
        //the variable that represents the day of the week value
        int wkDay = 0;
        //represent Y, Y/4, Y/100, Y/400 for Zeller's Congruence Algorithm
        //respectively
        int a, b, c, d;
        //represent monthVal, & dayVal respectively
        int m, n;
        //represent 13(m+1)/5
        int x, y, z;
        String decisionVal;
//       String decisionVal = userInputScanner.next();
        char userDec;
//      char userDec = decisionVal.charAt(0);
        //converts user string into a character variable
        int progDec = 0;
        //will be used to determine if the program should continue
        //running or if it will quit
        
        do{
            
            //ask the user to input the month of the year
        System.out.println("Please enter the month");
        int monthVal = userInputScanner.nextInt();
        
        //ask the user to input the day of the month
        System.out.println("Please enter the day of the month");
        int dayVal = userInputScanner.nextInt();
        
        //ask the user to input the 1year
        System.out.println("Please enter the year");
        int yearVal = userInputScanner.nextInt();
            
            switch(monthVal){
                case 1:
                    a = yearVal - 1;
                    b = (yearVal - 1)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal - 1)/400;
                    m = monthVal + 12;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>31 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 2:
                    a = yearVal - 1;
                    b = (yearVal - 1)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal - 1)/400;
                    m = monthVal + 12;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>29 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 3:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>31 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 4:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>30 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 5:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>31 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 6:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>30 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 7:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>31 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 8:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>31 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 9:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>30 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 10:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>31 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 11:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>30 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                case 12:
                    a = yearVal;
                    b = (yearVal)/4;
                    c = 6 * (yearVal)/100;
                    d = (yearVal)/400;
                    m = monthVal;
                    n = dayVal;
                    x = m + 1;
                    y = 13 * x;        
                    z = y /5;
                    
                    //checks to see if an appropriate day value has been checked
                    if (n>31 || n<1){
                        System.out.println("Error - Please Enter a month value "
                                + "between 1 - 31, and try again.");
                        progDec = 0;
                        break;
                    }
                    
                    wkDay = (n + z + a + b + c + d)%7;
                    break;
                default:
                   
                        System.out.println("Error - One or more inputs can't be "
                                + "processed, please correct, and try again.");
                        progDec = 0;
                        break; 
            }
            
            switch(wkDay){
                case 0:
                //Saturday    
                    System.out.println("You entered " + monthVal + "/" 
                            + dayVal + "/" + yearVal + " - Saturday");
                    
                    break;
                case 1:
                //Sunday    
                    System.out.println("You entered " + monthVal + "/" 
                            + dayVal + "/" + yearVal + " - Sunday");
                    
                    break;
                case 2:
                //Monday    
                    System.out.println("You entered " + monthVal + "/" 
                            + dayVal + "/" + yearVal + " - Monday");
                    
                    break;
                case 3:
                //Tuesday   
                    System.out.println("You entered " + monthVal + "/" 
                            + dayVal + "/" + yearVal + " - Tuesday");
                    
                    break;
                case 4:
                //Wednesday    
                    System.out.println("You entered " + monthVal + "/" 
                            + dayVal + "/" + yearVal + " - Wednesday");
            
                    break;
                case 5:
                //Thursday    
                    System.out.println("You entered " + monthVal + "/" 
                            + dayVal + "/" + yearVal + " - Thursday");
            
                    break;
                case 6:
                //Friday    
                    System.out.println("You entered " + monthVal + "/" 
                            + dayVal + "/" + yearVal + " - Friday");
            
                    break;
                default:
                //Code Malfunction    
                    System.out.println("Something with your code is not correct"
                            + " please fix your code and try again");
                    progDec = 0;
                    break;
                    
            }
            
            //ask the user if they would like to quit
            System.out.println("Would you like to enter a new date? [y/n]");
            decisionVal = userInputScanner.next();
            userDec = decisionVal.charAt(0);
            //this switch statement is to determine if the user wishes
            //to enter a new date to determine what day it falls on
            switch (userDec){
                case 'y':
                    progDec = 1;
                    break;
                case 'n':
                    System.out.println("Goodbye!");
                    progDec = 0;
                    break;
            }
        }
        while (progDec == 1);
        
    }
}
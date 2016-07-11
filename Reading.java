/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

/**
 *
 * @author SOLTAYLO
 */
class Reading {
    private String dayOfWeek;
    private int hrOfDay;
    private double tempDay;
    private double windSpeed;
//    private String timeOfDay;
//    private String dayType;

    
    public Reading (String line){
        //when a string is passed through this constructor in the reading class
        //it initially splits the string into individual elements after each
        //comma tha the program reads as its running
        String[] elements = line.split(", ");
        
        dayOfWeek = elements[0];
        hrOfDay = Integer.valueOf(elements[1]);
        tempDay = Double.valueOf(elements[2]);
        windSpeed = Double.valueOf(elements[3]);
        
    }
    
    public String rateTemperature (){
     //this method checks the temperature of the day 
     //to identify the type of day it is   
        
        if (tempDay < 55){
            return "cold";
        }
        else if(tempDay >= 80){
            return "hot";
        }   
        else if (tempDay >= 55 & tempDay < 65){
            return "mild";
        }
        else if (tempDay >= 65 & tempDay < 80){
            return "warm";
        } else
            return "";
    }
    
    
    public String getTime(){
    //this method looks at the time associated with each array element
    //to identify the hour of the day it     
        
        switch(hrOfDay){
            case 9:
                return (dayOfWeek+" morning");
            case 15:
                return (dayOfWeek+" afternoon");
            case 21:
                return (dayOfWeek+ " evening");
             default:
                System.out.println("Wrong input");//Modify message accordingly
                return "";
        }
    }
       
}

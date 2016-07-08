/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;
import java.util.Scanner;
/**
 *
 * @author SOLTAYLO
 */
public class TempConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               //initiate new scanner utility
        Scanner userInputScanner = new Scanner(System.in);
        
        //user input fahrenheit temperature
        System.out.println("Please enter Fahrenheit temperature");
        double fahrenheitTemp1 = userInputScanner.nextFloat();
        
        double celsiusTemp = ((5*(fahrenheitTemp1-32))/9);
        
        System.out.println(celsiusTemp);

    }
    
}

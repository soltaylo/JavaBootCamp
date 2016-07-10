/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedifs;

/**
 *
 * @author SOLTAYLO
 */
public class NestedIfs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float students= 0.0f;
       float rooms = 4.0f;
       
       if (students> 0.0f){
           if (rooms> 0.0f)
            System.out.println(students/rooms);
        }
        else
           System.out.println("No Students");
       
       System.out.println();
       System.out.println("** end program **");
       
    }
    
}

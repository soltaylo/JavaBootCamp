/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcengine;

/**
 *
 * @author SOLTAYLO
 */
public class MathEquation {
    
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;
    
    public double getLeftVal(){return leftVal;}
    public void setLeftVal(double leftVal){this.leftVal = leftVal;}
    public double getRightVal(){return rightVal;}
    public void setRightVal(double rightVal){this.rightVal = rightVal;}
    public char getopCode(){return opCode;}
    public void setopCode(char opCode){this.opCode = opCode;}
    
    //to may a value read only; do not include a mutator 
    //command within the accessor; create an accessor for results
    public double getResult(){return result;}
    
    public void execute () {
        
        switch(opCode){
                case 'a':
                    result = leftVal + rightVal;
                    break;
                case 's':
                    result = leftVal - rightVal;
                    break;
                case 'd':
                {
                    //this statement relaces the below if statement
                    result = rightVal != 0.0d ? leftVal/ rightVal : 0.0d;
                    break;
                }
                case 'm':
                    result = leftVal * rightVal;
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    result = 0.0d;
                    break;
            }
    }
    
    
    
    
}

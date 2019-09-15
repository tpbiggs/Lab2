
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpbig
 */
public class TestScores{
    public static void main(String[] args){
        
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter Test Score 1: \n");
    float   testOne =   keyboard.nextFloat();
    System.out.println("Enter Test Score 2: \n");
    float   testTwo =   keyboard.nextFloat();
    System.out.println("Enter Test Score 3: \n");
    float   testThree   =   keyboard.nextFloat();
    
    float   testAVG =   (testOne + testTwo + testThree)/3;
    
    System.out.println("Average Test Score = " + testAVG);
    if (testAVG >= 90) {
        System.out.println("A Grade");
    }
    else if (testAVG >= 80 && testAVG <= 89){
        System.out.println("B Grade");
    }
    else if (testAVG >= 70 && testAVG <= 79){
        System.out.println("C Grade");
    }
    else if (testAVG >= 60 && testAVG <= 69){
        //nice
        System.out.println("Grade D");
    }
    else{
        System.out.println("Grade F");
    }
    }
}

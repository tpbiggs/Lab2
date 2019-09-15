
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
public class BarChart {
    public static void main(String[] args){    
        Scanner keyboard    =   new Scanner(System.in);
        
        int stars1,stars2,stars3,stars4,stars5 = 0;
        
        System.out.println("Store 1 Sales: $");
        int     salesOne    =   keyboard.nextInt();
        System.out.println("Store 2 Sales: $");
        int     salesTwo    =   keyboard.nextInt();
        System.out.println("Store 3 Sales: $");
        int     salesThree  =   keyboard.nextInt();
        System.out.println("Store 4 Sales: $");
        int     salesFour   =   keyboard.nextInt();
        System.out.println("Store 5 Sales: $");
        int     salesFive   =   keyboard.nextInt();
        
        stars1 = salesOne / 100;
        stars2 = salesTwo / 100;
        stars3 = salesThree / 100;
        stars4 = salesFour / 100;
        stars5 = salesFive / 100;
        
        System.out.println("STORE SALES BAR CHART");
        System.out.println("Store 1: ");
        for (int i = 0; i <= stars1; ++i){
            System.out.print("*");
        }
        
        System.out.println("Store 2: ");
        for (int i = 0; i <= stars2; ++i){
            System.out.print("*");
        }
        
        System.out.println("Store 3");
        for (int i = 0; i <= stars3; ++i){
            System.out.print("*");
        }
        
        System.out.println("Store 4");
        for (int i = 0; i <= stars4; ++i){
            System.out.print("*");
        }
        
        System.out.println("Store 5");
        for (int i = 0; i <= stars5; ++i){
            System.out.print("*");
        }
        
    }
}

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
public class AddEmUp {
        public static void main(String[] args){
        Scanner keyboard    =   new Scanner(System.in);
        
        System.out.println("What number are we adding up to? \n");
        int     addNum  =   keyboard.nextInt();
        int     numTot  =   0;
        int     i   =  addNum;
      
        do{
            numTot = numTot + i;
            i   =   i - 1;
        }while(i > 0);
        
        System.out.println("Total: " + numTot);
        }
}

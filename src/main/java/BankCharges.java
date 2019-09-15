
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
public class BankCharges {
    public static void main(String[] args){
        Scanner keyboard    =   new Scanner(System.in);
        
        System.out.println("How many checks were wrote this month?: \n");
        Float   checksWrote =   keyboard.nextFloat();
        double   monthlyFee = 10;
        
        if (checksWrote < 20) {
            monthlyFee  =   (double) ((checksWrote * 0.10) + monthlyFee);
        }
        else if (checksWrote >= 20 && checksWrote <= 39 ){
             monthlyFee = (double) (monthlyFee + (checksWrote * 0.08));
       }
        else if (checksWrote >= 40 && checksWrote <= 59) {
            monthlyFee = (double) (monthlyFee + (checksWrote * 0.06));
        }
        else if (checksWrote >= 60) {
            monthlyFee = (double) (monthlyFee + (checksWrote * 0.04));
        }
        else {}
        
        System.out.println("Total Monthly Fees: $" + monthlyFee);
    }
}

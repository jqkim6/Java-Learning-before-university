/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author jiangqiang
 */
public class ComputeChange {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56:");
        double amount = input.nextDouble();
        int remainingAmount = (int) (amount*100);
        int numberOfOneDollars = remainingAmount/100;
        remainingAmount = remainingAmount%100;
        int numberOfQuarters = remainingAmount/25;
        remainingAmount = remainingAmount%25;
        int numberOfDimes = remainingAmount/10;
        remainingAmount = remainingAmount%10;
        int numberOfNickels = remainingAmount/5;
        remainingAmount = remainingAmount%5;
        int numberOfPennies = remainingAmount;
        System.out.println("Your amount" + amount + "consist of");
        System.out.println(" " + numberOfOneDollars + "dollars");
        System.out.println(" " + numberOfQuarters + "quarters");
        System.out.println(" " + numberOfDimes + "dimes");
        System.out.println(" " + numberOfNickels + "nickels");
        System.out.println( + numberOfPennies + "pennies");
    }
   }

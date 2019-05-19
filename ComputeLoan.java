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

public class ComputeLoan {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter annual interset rate, e.g.,7.25%:");
    double annualInterestRate = input.nextDouble();
    double monthlyIntersetRate = annualInterestRate/1200;
    System.out.print("Enter number of years as an Interger, e.g.,5:");
    int numberOfYears = input.nextInt();
    System.out.print("Enter loan amount, e.g., 120000.95:");
    double loanAmount = input.nextDouble();
    double monthlyPayment = loanAmount*monthlyIntersetRate/(1-1/Math.pow(1+monthlyIntersetRate, numberOfYears));
    double totalPayment = monthlyPayment*numberOfYears*12;
    System.out.print("The monthly payment is $" + (int)(monthlyPayment*100)/100.0);
    System.out.print("The total payment is $" + (int)(totalPayment*100)/100.0);
}}

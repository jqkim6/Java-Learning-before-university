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
public class SolvingQuadraticEquations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("a= ");
        double a = input.nextDouble();
        System.out.print("b= ");
        double b = input.nextDouble();
        System.out.print("c= ");
        double c = input.nextDouble();
        double r1 = (-b+Math.pow(Math.pow(b, 2) - 4 * a * c,0.5) / (2 * a));
        double r2 = (-b-Math.pow(Math.pow(b, 2) - 4 * a * c,0.5) / (2 * a));
        if ((Math.pow(b, 2)-4*a*c) < 0)
            System.out.println("The equation has no real roots");
        else if ((Math.pow(b, 2) - 4 * a * c) == 0)
            System.out.println("The equation has one real roots. r1=r2=" + r1);
        else 
            System.out.println("The equation has two real roots. r1=" + r1 + "r2=" + r2);
        }
    }


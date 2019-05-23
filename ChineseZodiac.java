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
public class ChineseZodiac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year");
        int year = input.nextInt();
        switch (year % 12){
            case 0: System.out.print("monekey"); break;
            case 1: System.out.print("rooster"); break;
            case 2: System.out.print("dog"); break;
            case 3: System.out.print("pig"); break;
            case 4: System.out.print("rat"); break;
            case 5: System.out.print("ox"); break;
            case 6: System.out.print("tiger"); break;
            case 7: System.out.print("rabbit"); break;
            case 8: System.out.print("dragon"); break;
            case 9: System.out.print("snake"); break;
            case 10: System.out.print("horse"); break;
            case 11: System.out.print("sheep"); break;
        }
    }
}

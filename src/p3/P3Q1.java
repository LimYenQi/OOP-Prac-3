/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author Lim Yen Qi
 */
import java.util.Scanner;

public class P3Q1 {
    public static void main(String[] args) {
        int above = 0, below = 0;
        double total = 0, avg;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of quiz scores to process: ");
        int num = scanner.nextInt();
        int[] score = new int[num];
        
        System.out.print("\n");
        for (int i = 0; i < num; i++) {
            System.out.print("Score " +(i+1)+ ": ");
            score[i] = scanner.nextInt();
            total += score[i];
        }
        avg = total / num;
        for (int i = 0; i < num; i++) {
            if (score[i] >= avg) {
                above += 1;
            } else {
                below += 1;
            }
        }
        
        System.out.println("\nResults");
        System.out.println("=======");
        System.out.println("Average is "+avg);
        System.out.println("Numbner of scores above or equal to the average is " +above);
        System.out.println("Number of scores below the average is " +below);
    }
}

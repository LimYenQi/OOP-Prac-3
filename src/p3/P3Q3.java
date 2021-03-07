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

public class P3Q3 {
    public static void main(String[] args){
        int [] denomination = {100, 50, 20, 10, 5, 1};
        int [] qty = new int[6];
        int value, total = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the quantity for each denomination");
        System.out.println("Denomination(RM)\tQuantity");
        
        for(int i = 0; i < 6; i++) {
            System.out.printf("\t%5d\t\t", denomination[i]);
            qty[i] = scanner.nextInt();
            while (qty[i] < 0) {
                System.out.println("Please enter a positive integer!!");
                System.out.println("Denomination(RM)\tQuantity");
                System.out.printf("\t%5d\t\t", denomination[i]);
                qty[i] = scanner.nextInt();
            }
        }
        System.out.print("\nDenomination(RM)\tQuantity\tValue(RM)");
        for (int j = 0; j < 6; j++) {
            if (qty[j] > 0) {
                value = denomination[j] * qty[j];
                System.out.printf("\n\t%5d\t\t%6d\t\t%8d", denomination[j], qty[j], value);
                total += value;
            }
        }
        System.out.println("\nTotal = RM " +total);
    }
}

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
public class P3Q2 {
    public static void main(String[] args) {
        int[] list = {1, 2, 4, 5, 10, 100, 2, -22};
        int small = smallestNum(list);
        System.out.println("The index of the smallest element in the array is " +small);
    } 
    
    public static int smallestNum (int list[]) {
        int smallest = list[0]; 
        int index = 0;
        
        for (int i = 1; i < 8; i++) {
            if (list[i] < smallest) {
                smallest = list[i];
                index = i;
            }
        }
        return index;
    }
}

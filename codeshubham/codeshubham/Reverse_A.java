package codeshubham;

import java.util.Scanner;

public class Reverse_A {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the value of array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Rrquired array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Reverse Array is:");
        for (int i = a.length-1; i>=0;i--) {
            System.out.print(a[i]);
        }
}
}

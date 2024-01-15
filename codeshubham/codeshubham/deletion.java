package codeshubham;

import java.util.Scanner;

public class deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[100];
        System.out.println("enter the size of array:");
            int size=sc.nextInt();
        System.out.println("Enter the value of element:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Befor deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("enter the postion :");
        int pos =sc.nextInt();
        for (int i = pos; i < size; i++) {
            a[i] =a[i+1];
        }
       --size;
       System.out.println("After deletion :");
       for (int i = 0; i < size; i++) {
        System.out.print(a[i]+" ");
       }
    }
}

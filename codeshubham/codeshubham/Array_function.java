package codeshubham;

import java.util.Scanner;

public class Array_function {
    public static void update(int a[]){
        for (int i = 0; i < a.length; i++) {
            a[i]=a[i]+1;
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the value of array");
        for (int i = 0; i < a.length; i++) {
            a[i] =sc.nextInt();
        }
        System.out.println("requitrd array is :");
        for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
        }
        System.out.println("Update array is:");
        update(a);


        for (int i = 0; i < a.length; i++) {
            
            System.out.println(a[i]+" ");
        }

    }
}

package codeshubham;

import java.util.Scanner;

public class Armethic {
   public static int getlargest(int a[]){
      int largest= Integer.MIN_VALUE;
      int smallest=Integer.MAX_VALUE;
      for (int i = 0; i < a.length; i++) {
         if ( largest<a[i]) {
            largest=a[i]; 
         }
         if (smallest > a[i]) {
            smallest=a[i];
         
         }
      }
      System.out.println("Smallest value:"+smallest);
      return largest;

   }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array:");
     int n= sc.nextInt();
     int a[] = new int [n];
     System.out.println("Enter the value of array:");
     for (int i = 0; i < a.length; i++) {
        a[i] = sc.nextInt();
     }
     System.out.println("Required array is:");
     for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
     }
     
    System.out.println("largest value :"+getlargest(a));
     
     }


        
    }


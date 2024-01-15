package codeshubham;

import java.util.Scanner;

public class Binary_A {
    public static int binaraysearch(int a[],int key){
        int start=0 ,  end = a.length-1;
        while (start <= end) {
            int mid= (start+end)/2;
            if (a[mid] == key) {
                return mid; 
            }
            if (a[mid] < key) {
                start=mid+1;
            } else {
                end=mid-1;
            }
            
        }
        return-1;
    }
 



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
        System.out.println("Enter the value of key:");
        int key = sc.nextInt();
        System.out.println("key index :"+binaraysearch(a, key));
}
}

package codeshubham;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
     public  int missing(int a[]) {
        int i = 0;
        while (i < a.length) {
            int current = a[i]-1;
           if (a[i]<a.length && a[i]!=a[current]) {
            swap(a,i,current);
           }
           else{
            i++;
           }
        }
        for (int index = 0; index < a.length; index++) {
            if (a[index]!=index) {
                return index;
            }
        }
        return a.length;
    }
    static void swap(int a[], int first, int second){
        int temp = a[first];
        a[first]=a[second];
        a[second]=temp;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        for (int  i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("after Sorting:");
        MissingNumber my = new MissingNumber();
        int miss=my.missing(a);
        System.out.println("missing number:"+miss);

       

    }
    
}

package codeshubham;
import java.util.Scanner;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

public class BubbleSort {
    public static void PrintArry(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
    
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int []a=new int [n];
        System.out.println("Insert the value in array:");
        for(int i=0 ; i<n ;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Required array is:");
        
        for (int i = 0; i<n; i++) {
            System.out.println(a[i]);
        }
        //bubble sort
        System.out.println("Sorted Array is:");

        for (int i = 0; i < a.length; i++) {
            for(int j=0 ; j<n-i-1; j++){
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        PrintArry(a);
    }
}

package codeshubham;
import java.util.Scanner;

public class Slectionsort {
    public static void PrintArry(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    int []a= new int [n];
    System.out.println("Insert the size of array:");
    for (int i = 0; i < n; i++) {
        a[i]=sc.nextInt();
    }
    System.out.println("Required array is:");
    for (int i = 0; i < n; i++) {
        System.out.println(a[i]);
    }
    System.out.println("Sorted array is:");
    for (int i = 0; i < a.length; i++) {
        int smallest=i;
        for (int j = i+1; j < a.length; j++) {
            if (a[smallest]>a[j]) {
                smallest=j;
            }
           
        }
        int temp=a[smallest];
        a[smallest]=a[i];
            a[i]=temp;
    }
    PrintArry(a);
    }
}

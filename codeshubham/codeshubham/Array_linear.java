package codeshubham;
import java.util.Scanner;

public class Array_linear {
    
    public static int linersearch(int a[],int key ){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key) {
                return i;
            }
            
        }
        return -1;

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
        int key =sc.nextInt();
        int index = linersearch(a, key);
        if (index ==-1) {
            System.out.println("Not found");
        }
        System.out.println("key is at index:"+index);

    }
}

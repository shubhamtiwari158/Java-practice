package codeshubham;
import java.util.Scanner;
public class Insert_delet {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a[] = new int[100];
        System.out.println("Enter the size  of array:");
        int n = sc.nextInt();
        
        System.out.println("Enter the value of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("berfor insertion array:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter the element to be Inserted");
        int x= sc.nextInt();
        System.out.println("Enter the position or Index where you want to insert:");
        int pos =sc.nextInt();
        for (int i = n; i > pos; i--) {
            a[i] = a[i-1];
        }
        a[pos] =x;
        ++n;

        System.out.println("Array After Inertion:");
        for (int  i= 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

    }
}

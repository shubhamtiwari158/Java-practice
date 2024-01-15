package codeshubham;

import java.util.Scanner;
public class pratice {
    /**
     * 
     */
    public  static void show(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of aaray:");
        int n =sc.nextInt();
        int []a= new int [n];
        System.out.print("Enter the value of array:");
        for (int i = 0; i <a.length; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println("required arry is:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //sorting
        System.out.println("Sorted  array is :");
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (a[j]>a[j+1]) {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                
            }
            
        }
        }
       show(a);


        
    }
}

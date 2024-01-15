package codeshubham;

import java.util.Scanner;

public class pairs_A {
    
    /**
     * @param a
     */
    public static void PrintPair(int a[]){
        int tp=0;
        System.out.println("Pairs of Array:");
        for (int i = 0; i < a.length; i++) {
            int curr = a[i];
            for (int j = i+1; j < a.length; j++) {
                
                System.out.print("("+curr+","+a[j]+")");
                tp++;
        }
        System.out.println();

    }
    System.out.println("total Pair:"+tp);
}

    public static void main(String[] args) {
        // int a[] = {2,4,6,8,10};
        // PrintPair(a);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] =new int[n];
        System.out.println("Enter the value of array:");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Required array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        PrintPair(a);



    }





}


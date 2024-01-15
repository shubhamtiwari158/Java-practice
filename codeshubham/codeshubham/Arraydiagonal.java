package codeshubham;


import java.util.Scanner;

public class Arraydiagonal {
    // public static int calculate(int a,int b){
    //     int sum=a+b;
    //     return sum;
 
    // }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int sum=calculate(a, b);
        // System.out.print("sum of 2 no. is: ");
        // System.out.println(sum);
        // int n=sc.nextInt();
        // int a[] = new int[n];
        // int sum =0;
        // for (int i = 0; i < n; i++) {
        //     sum += sc.nextInt();
        // }
        // int sum =0;
        // for (int i = 0; i < a.length; i++) {
        //     sum+=a[i];
        // }
        // System.out.println("sum:"+sum);



     System.out.println("entr the no of row");
        int n=sc.nextInt();
        // System.out.println("enter the no of column:");
        // int m=sc.nextInt();
        System.out.println("enter the values:");
        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("required output:");
        for (int i= 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");

        }
        System.out.println();
    }
    int pri=0;
    int sec=0;
    for (int i = 0; i <n; i++) {
        for (int j = 0; j <n; j++) {
            if (i==j) {

                pri +=a[i][j];
            }
            if ((i+j)==(n-1)) {
                sec += a[i][j];
                
            }
        } 
    }
    System.out.println("primary:"+pri);
    System.out.println("secondary:"+sec);
      int diff=sec-pri;
     System.out.println("difference:"+ diff);
        
        
        }
    }

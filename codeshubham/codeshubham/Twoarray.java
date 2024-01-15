package codeshubham;
import java.util.Scanner;

public class Twoarray {

    public static void main(String[] args) {
    //   int  rows=0;
    //   int  cols=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int rows=sc.nextInt();
        System.out.println("enter the number of cols :");
        int cols=sc.nextInt();

         int number[][] = new int[rows][cols];
       for (int i = 0; i<rows; i++) {
        for (int j = 0; j<cols; j++) {
            number[i][j] =sc.nextInt();
        }
        
       }
       System.out.println("require output");
       for (int i = 0 ;i < rows; i++) {
        for (int j = 0; j <cols; j++) {
            System.out.print(number[i][j] );
        }
        System.out.println();
       }
       }

   
    }
       
    
    




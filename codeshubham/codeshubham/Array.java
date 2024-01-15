package codeshubham;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //int [] marks= new int [3];
        //int marks[] =new int[3];
        //marks [0] =89 ;
        //marks [1]=89 ;
      //  marks [2]=98;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        System.out.println("enter the size of array:");

        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int [] number=new int [size];
        System.out.println("Insert the element on array    ");
//input
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
            
        }
        System.out.println("Required array is:");
        //output
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
    }
}

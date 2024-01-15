package codeshubham;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Array_of_5_float {
    public static void main(String[] args) {
    //     float [] marks={56.7f,67.56f,89.4f,98.5f};
    //     float sum=0;
    //     for (float f : marks) {
    //         sum=sum+f;
    //     }
    //     System.out.print("the value of sum="+sum);
    // }
    int sum=0;
    int avg=0;
    int square=0;
    System.out.println("enter the size of array=");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int [] A=new int [size];

    for (int i= 0; i < size; i++) {
        A[i] = sc.nextInt();
    }
    System.out.println("Required output");
    for (int i = 0; i < size; i++) {
        System.out.println(A[i]+1);
    }
    for (int i : A) {
        sum+=i;
        avg=sum/size;
        square=i*i;
        System.out.println("Square of array is:"+square);
    }
    System.out.println("Sum of array is:"+sum);
    System.out.println("Average of array is:"+avg);
    
}
}
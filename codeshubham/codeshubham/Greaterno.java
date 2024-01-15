package codeshubham;
import java.util.Scanner;

public class Greaterno {
    static void print(int a,int b){
        if (a>b) {
            System.out.println("greatest number is:" +a);
        }
        else{
            System.out.println("greatest number is :" +b);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        print(a, b);


    }
}

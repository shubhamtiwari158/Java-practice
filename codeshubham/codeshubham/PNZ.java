
package codeshubham;
import java.util.Scanner;

public class PNZ {
    static void check(int n){
        if (n==0) {
            System.out.println("zero" );
        }
        else if (n>0) {
            System.out.println("Positive number :" );
        }
        else{
            System.out.println("Negitive number :" );
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        check(n);
    }
}

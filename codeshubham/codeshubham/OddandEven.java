
package codeshubham;
import java.util.Scanner;

public class OddandEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

     System.out.print("enter the number:");
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.print("Even number");
            
        }
        else{
            System.out.print("Odd number");
        }
    }
}

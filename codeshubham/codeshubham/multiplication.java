
package codeshubham;
import java.util.Scanner;

public class multiplication {
    public static int product(int a,int b){
        int diff=a*b;
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int diff=product(a, b);
        System.out.println("product of 2 no. is: ");
        System.out.println(diff);
    }
}

package codeshubham;
import java.util.Scanner;

public class check {
    public static void checkNumber(int n){
        if (n%2==0) {
            System.out.println("Even no."); 
        }
        else{
            System.out.println("Odd no.");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        checkNumber(n);
    }
}

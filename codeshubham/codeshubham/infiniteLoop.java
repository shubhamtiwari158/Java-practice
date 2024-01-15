package codeshubham;
import java.util.Scanner;

public class infiniteLoop {
    static void loop(int n){
        int i=1;
        while(i<=n) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        loop(n);
    }
}

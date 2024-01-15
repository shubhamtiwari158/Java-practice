package codeshubham;
import java.util.Scanner;
public class average {
    public static int  calculate(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("sum is :" + sum);
        System.out.println("average of three number is: ");
        int avg=sum/3;
        return avg ;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int a= sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       
        
        System.out.println(calculate(a, b, c));
    }
}

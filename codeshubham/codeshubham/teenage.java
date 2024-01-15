package codeshubham;
import java.util.Scanner;

public class teenage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your age:");
        int age=sc.nextInt();
        if (age>13 && age<19) {
            System.out.println("teenager");
            
        }
        else{
            System.out.println("not teenager");
            
        
        }
    }
}

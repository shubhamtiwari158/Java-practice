
package codeshubham;import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.jar.Manifest;

public class threelargestno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number:");
        int first=sc.nextInt();
        System.out.println("Enter second number:");
        int second=sc.nextInt();
        System.out.println("Enter third number:");
        int third=sc.nextInt();

        if (first>second && first >third) {
            System.out.println("first no.is larger then second and third no..");
        }
        else if (second>third && second>first) {
            System.out.println("second no.is larger then first and third no..");
        }
        else if (third>first && third > second) {
            System.out.println("third no.is larger then second and first no..");
        }

    }
}

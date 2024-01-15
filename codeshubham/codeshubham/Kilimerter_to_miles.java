package codeshubham;
import java.util.Scanner;

public class Kilimerter_to_miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the distance in km=");
        int km= sc.nextInt();
        double miles= km*0.621371;
        System.out.print("1 miles=" + miles);


    }
}

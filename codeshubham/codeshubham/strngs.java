package codeshubham;
import java.util.Scanner;

public class strngs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstname= sc.next();
        String secondname= sc.next();

        String fullname=firstname+ " "+secondname;
        System.out.println(fullname);
    }
}

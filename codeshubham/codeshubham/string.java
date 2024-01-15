package codeshubham;
import java.util.Scanner;

import javax.sql.rowset.spi.TransactionalWriter;

public class string {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter your name:");
        // String name=sc.nextLine();
        // System.out.println(name);
    String firstname= "shubham";
        String secondname= "Tiwari";
        final String fullname= firstname + secondname;
        System.out.println(fullname.length() );
        for (int i=0; i<fullname.length() ; i++) {
            System.out.println(fullname.charAt(i));
        }




    }
}

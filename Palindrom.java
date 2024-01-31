import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Palindrom {
    public static boolean isPalindrom(String str){
        private static final String YES = "Yes";
        private static final String NO = "No";
        for (int i = 0; i < str.length()/2; i++) {
            int n= str.length();
            if (str.charAt(i) == str.charAt(n-i-1)) {
                return Yes;
            }
        } 
        return No;
    }
   
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String name=sc.next();
        System.out.println(isPalindrom(name));

    }
}

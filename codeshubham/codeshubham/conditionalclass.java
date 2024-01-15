package codeshubham;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthContext;

public class conditionalclass {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a==b) {
            System.out.println("Both the no.are equal");
            
        }
        else if(a>b){
           System.out.println("a is greater ");
        }
        else  {
            System.out.println("b is greater ");
        }
    }
}

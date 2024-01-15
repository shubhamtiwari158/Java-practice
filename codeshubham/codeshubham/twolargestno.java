package codeshubham;
import java.util.Scanner;
public class twolargestno {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no.");
        int first1=sc.nextInt();
        System.out.print("enter second no.");
        int second2=sc.nextInt();
        
        if(first1>second2){
            System.out.print("first1 no.larger is then second2 no..");
        }
        else{
            System.out.print("second2 no.larger is then first1 no..");
        }
        


    }
}

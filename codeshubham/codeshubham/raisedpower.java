package codeshubham;
import java.util.Scanner;
public class raisedpower {
    static int calculate(int base,int exponent){
        int pow=1;
       for (; exponent !=0;-- exponent) {
         pow=pow*base;
        
       }
       System.out.println("y :" +pow);
        
        return pow ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base number:");
        int base=sc.nextInt();
        System.out.print("enter the power number:");
        int exponent=sc.nextInt();
      int pow=calculate(base, exponent);
       

    }
}

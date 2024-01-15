package codeshubham;
import java.util.Scanner;

public class calculator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value a=");
        int a=sc.nextInt();
        System.out.println("enter the value b=");
        int b=sc.nextInt();
        System.out.println("enter your operator");
        int button=sc.nextInt();
    

         switch (button) {
            case 1:System.out.println("c=" + a+b);
                
                break;
                case 2: System.out.println("c=" + a*b);
                break;
                case 3: System.out.println("c=" + a/b);
                break;
                case 4: System.out.println("c=" + a%b);
                break;
                  case 5: System.out.println( "c=" + (a-b));

         
            default:
            System.out.println("enter correct option");
                break;
         }
    }
}

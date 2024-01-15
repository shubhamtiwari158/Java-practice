package codeshubham;
import java.util.Scanner;

public class circumfarenceOfCircle {
    static void calculate(int radius){
        float c_area =  (float) (2 * 3.14 * radius) ;
        System.out.println("Circumfarence of circle is :" + c_area);
        return ;

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the radius :");
        int radius=sc.nextInt();
        calculate(radius);
        
    }
}

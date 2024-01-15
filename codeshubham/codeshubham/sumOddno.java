package codeshubham;
import java.util.Scanner;

public class sumOddno {
    public static int calculate(int n){
        int sum=0;
         {
                for (int i = 1; i < n; i++){
                    if (i%2 !=0) {
                        sum+=i;
                        
                        
                    }
                    
            }
            
            
            
        }
        return sum ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        int sum = calculate(n);
        System.out.print("sum of odd number = " + sum);
        //System.out.println(sum);
        

    }
}


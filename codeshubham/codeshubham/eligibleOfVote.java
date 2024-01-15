package codeshubham;
import java.util.Scanner;

public class eligibleOfVote {
    static void eligible(int age){
        if (age>18) {
            System.out.println("Eligible to vote : " +age);
            
        }
        else{
            System.out.println("Not Eligible to vote" +age);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligible(age);
    }
}

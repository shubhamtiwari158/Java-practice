package codeshubham;
import java.util.Scanner;

public class table {
    public static int  product(int a[],int target){
        for(int i=0;i<a.length;i++){
           if(a[i]==target){
          return target;
}
        }
 return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        int n=sc.nextInt();
        int a[] = new int [n];
        
        for(int i=0; i<a.length;i++){
           a[i]= sc.nextInt();
       }
           System.out.print("Required array:");
          for(int i=0; i<a.length;i++){
          System.out.print(a[i]+" ");
          }

System.out.print("Enter the key");
    int target=sc.nextInt();
   int ab=  product(a, target);
    System.out.print("target element:"+ ab);



               
    }
}

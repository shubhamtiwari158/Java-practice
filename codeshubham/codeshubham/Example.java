package codeshubham;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("enter the no.");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(
    int i = 1;i<=10;i++)
    {
        int x = n * i;
        System.out.println(n + "*" + i +"="+x);
    }
}
}
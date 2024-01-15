package codeshubham;

import java.util.Scanner;

public class BuyShellStock {
    public int BuyShell(int price[] ){
        int buyprice=Integer.MAX_VALUE;
        int Maxprofit=0;
        for (int i = 0; i < price.length; i++) {
            if (buyprice< price[i]) {
                int profit = price[i]-buyprice;
                Maxprofit=Math.max(Maxprofit, profit); 
            }else{
                buyprice=price[i];
            }
        }
        return Maxprofit;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price[] = new int [n];
        for (int i = 0; i < price.length; i++) {
            price[i]= sc.nextInt();
        }
        BuyShellStock by= new BuyShellStock();
        System.out.println("Maxprice:"+by.BuyShell(price));
    }
}

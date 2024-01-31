public class SumofNatural {
    public static int print(int n){
        if (n==1) {
            // System.out.print(n+" ");
            return 1;
        }
        
        // print(n-1);
        // System.out.print(n+" ");
        // print(n-1);
        int x=print(n-1);
        int sum=n+x;
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
      int res=  print(n);
      System.out.println(res );
    }
}

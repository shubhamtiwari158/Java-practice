public class Factorial {
    public static int fac(int n){
         
     if (n==0||n==1) {
      return 1;
    }
    if (n< 0) {
        return -1;
    }
    else
    return (n*fac(n-1));
    }
    public static void main(String[] args) {
        int res=fac(5);
        System.out.println(res );
    }
}

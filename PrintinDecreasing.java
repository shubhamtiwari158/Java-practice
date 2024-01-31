public class PrintinDecreasing {
    public static void main(String[] args) {
        int n=10;
        desc(n);
    }
    public static void desc(int n){
        if (n==0) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        desc(n-1);

    }
}

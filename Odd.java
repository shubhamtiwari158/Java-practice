public class Odd {
    public static void  isOddandEven(int n){
    int BitMax=1;
    if ((n & BitMax)==0) {
        System.out.println("Even Number");
    }else{
        System.out.println("Odd Number");
    }
    }
    public static void main(String[] args) {
        isOddandEven(11);
        isOddandEven(12);
        isOddandEven(15);
    }
}

package codeshubham;

public class kadanesAlgorithm {
    public static void PrintKadans(int a[]){
        int cm=0;
        int ms=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            cm = cm +a[i];
            if (cm <0) {
                cm=0;
            }
            ms =Math.max(ms, cm);
        }
        System.out.println("Maximum sum:"+ms);

    }

    public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        PrintKadans(a);
    }
}

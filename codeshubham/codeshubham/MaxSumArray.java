package codeshubham;

public class MaxSumArray {
    public static void PrintMaxSubarray(int a[]){
        int currsum=0;
        int Maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int start =i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                currsum=0;
                for (int k = start; k <= end; k++) {
                    currsum+=a[k];
                }
                System.out.println("Current sum:"+currsum);
                if (Maxsum < currsum) {
                    Maxsum=currsum;
                }
            }
        }
        System.out.println("Maxsum:"+Maxsum);

    }
    public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        PrintMaxSubarray(a);
    }
}

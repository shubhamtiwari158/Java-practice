package codeshubham;

public class PrifixSum {
   public static void PrintMaxPrifixSubarray(int a[]){
    int currsum =0;
    int Maxsum=Integer.MIN_VALUE;
    int prifix[] = new int [a.length];
    prifix[0] = a[0];
    for (int i = 1; i < prifix.length; i++) {
        prifix[i]= prifix[i-1]+a[i];
    }
    for (int i = 0; i < a.length; i++) {
        int start = i;
    
    for (int j = 0; j < a.length; j++) {
        int end = j;
        currsum= start == 0 ? prifix[end] : prifix[end]-prifix[start-1]; 
        if (Maxsum < currsum) {
            Maxsum = currsum ;
        }

    }
   }
     System.out.println("MaxSum:"+Maxsum);
}
 public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        PrintMaxPrifixSubarray(a);
    }



}

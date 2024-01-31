public class SortedbyRecursion {
    public static boolean  Sort(int a[],int i){
        if (i==a.length-1) {
            return true;
        }
        if (a[i]>a[i+1]) {
            return false;
        }
        return Sort(a, i+1);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
       System.out.println(Sort(a, 0));


    }
}

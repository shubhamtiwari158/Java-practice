public class frequency {
    public static int frequency(int a[],int key){
        int count =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int  a[]={1,2,3,4,3,3,5,3,3,3,6};
        int key= 3;
        int res=frequency(a, key);
        System.out.println(res);
    }
}

public class FirstOccurence {
    public static int Search(int a[],int key,int i){
        if (i==a.length-1) {
            return 0;
        }
        if (a[i]==key) {
            return i;
        }
        return Search(a, key, i+1);
    }
    public static int LastOccurence(int a[],int key,int i){
        if (i==a.length) {
            return -1;
        }
        int isfound =LastOccurence(a, key, i+1);
        if (isfound == -1 && a[i]==key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int a[] = {1,223,3,56,76,56,98,53};
        int key = 56;
        int reslt =LastOccurence(a, key, 0);
        System.out.println( key+" at index: "+reslt);

    }
}

package codeshubham;

import java.util.Scanner;

public class RoatedStartedaray {
    public static int search(int a[],int target){
        if (a==null || a.length==0) {
            return -1;
        }
        int start =0;
        int end=a.length-1;
        while (start < end) {
            int mid=(start+end)/2;
            if (a[mid] > a[end]) {
                start= mid+1;
            }
            else{
                end = mid;
            }
        }
             int pivot=start;
             start=0;
             end=a.length-1;
             if ( target > a[pivot] && target <= a[end]) {
                start=pivot;
             }
             else{
                end=pivot;
             }
             while (start<= end) {
                int mid=(start+end)/2;
                if (a[mid]==target) {
                    return mid;
                }
                else if (a[mid]<target) {
                    start= mid+1;
                } else {
                    end=mid-1;
                }
             }
            return -1;
        }

    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the value of array");
        for (int i = 0; i < a.length; i++) {
            a[i] =sc.nextInt();
        }
        System.out.println("requitrd array is :");
        for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
        }
        System.out.println("Enter the value of target:");
        int target =sc.nextInt();
        System.out.println("element present in index:"+ search( a, target));
        

    }
}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();
        isAnagrma(str1, str2);

    }
    public static void isAnagrma(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2= str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}

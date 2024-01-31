import java.util.Scanner;

public class SubString {
    public static String substring(String str,int s,int e){
        String substr="";
        for (int i = s; i <=e; i++) {
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        int s=sc.nextInt();
        int e=sc.nextInt();
        System.out.println("subString is: "+str.substring(s,e));

    }
}

package codeshubham;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthContext;

public class solidpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}

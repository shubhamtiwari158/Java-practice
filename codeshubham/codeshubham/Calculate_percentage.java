package codeshubham;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.plaf.synth.SynthColorChooserUI;

public class Calculate_percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your Physic number=");
        int P=sc.nextInt();
        System.out.print("enter your English number=");
        int E=sc.nextInt();
        System.out.print("enter your Maths number=");
        int M=sc.nextInt();
        System.out.print("enter your Cemistry number=");
        int Ch=sc.nextInt();
        System.out.print("enter your physical Education number=");
        int Ph=sc.nextInt();
        double Total=(P+E+M+Ch+Ph);
        double calculate= (Total/500)*100;
        double res=calculate;
        double CGPA=res/9.5;
        System.out.println("Result=" +res +"%");
        System.out.println("CGPA=" + CGPA);
    }
}

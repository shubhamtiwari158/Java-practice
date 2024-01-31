import java.util.Scanner;

public class StringPrinter {
    public static void print(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        print(name);
        System.out.println("Lenght of String:"+name.length());
    }
}

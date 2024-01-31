import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.http.WebSocket.Builder;

public class PrimeinBuffer {
    public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader s=  new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number:");
    int number= Integer.parseInt(s.readLine());
    // if (number <=1) {
    //     System.out.println(number +" Not a Prime Number");
    // }  
    for(int i =2; i< number; i++){
        if (number%i==0) {
            System.out.println(number +" Not a prime Number");
        }
        else{
            System.out.println(number +" Prime Number");
        }
    }
    
    }
}
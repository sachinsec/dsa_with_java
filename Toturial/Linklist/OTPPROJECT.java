import java.util.Random;
import java.util.Scanner;

public class OTPPROJECT {
    public static void main(String[] args) {
        Random r = new  Random();
        int num = r.nextInt(9000)+1000;
        System.out.println(num);
        
        while (true) {
            System.out.println("Enter OTP: ");
            Scanner sc = new Scanner(System.in);
            int otp = sc.nextInt();
            if (num==otp) {
            System.out.println("OTP Verified! ");
            break;
        }
        else{
            System.out.println("Invalid OTP");
        }
            
        }
    }
}

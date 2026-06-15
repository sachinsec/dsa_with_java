import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Digits");
        long a =in.nextLong();
        System.out.println("Which number Wants to find");
        long b = in.nextLong();
        int count = 0;

        while (a > 0 ) {
            long digit = a%10;
            if (b==digit) {
                count ++;
            }

            a/=10;
        }
        System.out.println(count);


    }
}

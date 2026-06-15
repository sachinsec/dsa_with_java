import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b,c;
            b = 0 ;
            c= 1;

        for (int i = 2; i < a ; i++) {
         int temp = c;
         c = b +c;
         b = temp;         
        }
        if (a==1) {
            System.out.println(0);
        }
        else{
         System.out.println(c);
        }
        
    }
}

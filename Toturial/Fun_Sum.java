import java.util.Scanner;
public class Fun_Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number 1");
        int a = in.nextInt();
        System.out.println("Enter number 2");
        int b = in.nextInt();

        int c = a+b;
        
        System.out.println("Sum: "+c);
    }
}


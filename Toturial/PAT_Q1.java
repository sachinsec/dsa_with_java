import java.util.Scanner;

public class PAT_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many star you want to print");
        int n = sc.nextInt();
        patter(n);

    }
    static void patter(int n ){
     for (int i = n; i >= 1; i--) {
        // for every row , run the colz
        for (int j = i; j >= 1; j--) {
            System.out.print("* ");
        }
        System.out.println();
     }
    }
}

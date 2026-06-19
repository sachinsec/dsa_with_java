import java.util.Scanner;

public class ARR_Basics {
    public static void main(String[] args) {

        //Datatype[] variable_name = new Datatype[Size];
        //int [] a = new int[2];

        //int[]  b = {3,4,6};

        // int [] a = new int[2];

        // System.out.println("You can store 2 numbers.");
         Scanner in = new Scanner(System.in);
        
        // for (int i = 0; i < 2; i++) {
        //     a[i]=in.nextInt();
        // }
        // System.out.println("Which number shows");
        // int b = in.nextInt();

        // System.out.println(a[b-1]);


       //String array
       String [] arr = new String[2];
       System.out.println("Two Name can store");
       
       for (int i = 0; i < 2; i++) {
         arr[i]=in.next();
       }

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ARR_Input {
    
    public static void main(String[] args) {

        
        /*
        int [] arr = new int[4];
        For the foreach using in array syntax
        for (Datatype variable_name: Array_name){
        sout(varialbe_name)

        example

        for(int a : arr){
        sout(a);
        }
        }

        Other method to print it using Arrays package

        sout(Arrays.toString(arr)) ///
         */


        int [] a = new int[5];
        a[0] = 32;
        a[1] = 89;
        a[2] = 56;
        a[3] = 26;
        a[4] = 96;


        String [] str = new String[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i]=in.nextLine();

        }

        System.out.println(Arrays.toString(str));
        //From Foreach loop

        for (String t : str) {
            System.out.println(t);
        }
    }
}

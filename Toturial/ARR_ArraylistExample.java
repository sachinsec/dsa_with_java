import java.util.ArrayList;
import java.util.Scanner;

public class ARR_ArraylistExample {

    public static void main(String[] args) {
        //Syntax
       // ArrayList<Datatype> Variable_name = new ArrayList<>();

       ArrayList<Integer> list = new ArrayList<>(10); 

        // list.add(332);
        // list.add(333);
        // list.add(353);
        // list.add(3573);
        // list.add(332);
        // list.add(373);

        // System.out.println(list);

        // list.set(0, 99); // For the update or set any specific index value
        // list.remove(3);  // For the removing specific index

        // System.out.println(list.contains(353)); // for the searching 

        // System.out.println(list);


        //input

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());  // For the input
        }

        //Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  // Pass index here, list[index] syntax will not work here For the output
        }

    }
}
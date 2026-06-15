import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Fruites names");
        String name=in.next().toLowerCase();

      switch(name){
        case "mango"-> System.out.println("$2.5");
        case "orange"->System.out.println("$1.9");
        case "banana"->System.out.println("$0.9");
        case "papaya"->System.out.println("$2.9");
        case "guavava"->System.out.println("$1.9");
        case "litchi"->System.out.println("$3.9");
        default ->System.out.println("Not Available");

      }
    }
}

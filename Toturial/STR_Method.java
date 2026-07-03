import java.util.Arrays;
public class STR_Method {
    public static void main(String[] args) {
        String name = "Sachin Prajapat Hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println(name.endsWith("in"));
        System.out.println("     sachin      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

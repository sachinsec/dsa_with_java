import java.util.ArrayList;

public class STR_Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // This is same as ater a few steps: "a" + "1"
        // Integer will be converted to INteger thawt will call toSTring()

        System.out.println("Kunal " + new ArrayList());
        System.out.println("KUnal " + new Integer(56));
        System.out.println(new Integer(56) + "" + new ArrayList<>());
        System.out.println("a"+'b'); 

    }
}

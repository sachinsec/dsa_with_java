import java.util.ArrayList;

public class RECU_Subsequence {
    public static void main(String[] args) {

        subseq("", "abc");
        
    }

    static void subseq(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    // static ArrayList<String> subseg( String p, String up){
    //     if (up.isEmpty()) {
            
    //     }

    //     char ch = up.charAt(0);
    //     subseg(p + ch, up.substring(1));
    //     subseg(p, up.substring(1));
    // }
}

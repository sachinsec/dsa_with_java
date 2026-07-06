/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        int n = 5;
       System.out.println(recu(n));
    }

    static int recu(int n){
         if(n<1){
            return 0;
         }

         return (n + recu(n-1));
    }
}
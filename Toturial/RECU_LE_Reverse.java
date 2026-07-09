public class RECU_LE_Reverse {
    public static void main(String[] args) {
        int n = 123;
        rev1(n);
        System.out.println(rev);
    }

    static int rev = 0;
    static void rev1(int n){
        if (n == 0) {
            return ;
        }
        int d = n %10;
        rev = rev * 10 + d;
        rev1(n/10);
    }
}

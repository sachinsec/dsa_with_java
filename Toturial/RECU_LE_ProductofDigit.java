public class RECU_LE_ProductofDigit {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(prod(n));
    }

    static int prod(int n){

        if(n == 0){
            return 1;
        }

        return ((n%10) )* prod(n/10);
    }
}

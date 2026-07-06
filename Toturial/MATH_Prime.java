public class MATH_Prime {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(primenumber(n));
    }

    static boolean primenumber(int n){
        int count = 0;
        if (n < 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if(count == 2){
                break;
            }
            if (n%i == 0) {
                count ++;
            }
        }
        return count == 2;
    }
}

public class MATH_LCMself {
    public static void main(String[] args) {
        int a = 20 ;
        int b = 10;
        
    }
    static void lcm(int a, int b){

        int lcm = 0;
        if (a > b) {
            for (int i = b; i > 0; i --) {
                if (a % i == 0 && b % i == 0) {
                    lcm = i*a;
                }
            }
        }
        else{

            for (int i = a; i > 0; i --) {
                if (b % i == 0 && a % i == 0) {
                    lcm = i*b;
                }
            }
        }
        System.out.println(lcm);
    }
}

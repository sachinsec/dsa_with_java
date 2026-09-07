public class dividetwo29 {
    public static void main(String[] args) {
        int a =-2147483647 ;
        int b = -1;
       System.out.println(divide(a, b));
    }

    static  int divide(int dividend, int divisor) {
        // int d = 7;
        // int e =-3;
        long sum = 0;
        int c  =0;
        long a,b;

        if (dividend==Integer.MIN_VALUE && divisor == -1) {
            return (Integer.MAX_VALUE);
        }
         if (dividend==Integer.MAX_VALUE && divisor == 1) {
            return (Integer.MAX_VALUE);
        }  
        if (dividend==Integer.MIN_VALUE && divisor == 1) {
            return (Integer.MIN_VALUE);
        }
         if (dividend==Integer.MAX_VALUE && divisor == -1) {
            return (Integer.MIN_VALUE);
        }

        if(dividend<0){
            a = -(long) (dividend);
        }else{
            a=dividend;
        }
        if (divisor<0) {
            b = -(long)(divisor);
        }else{
            b=divisor;
        }
        
        for (long i = 0; i < a; i++) {
            sum+=b;
            if (a>=sum) {
                c++;
            }else{
                break;
            }
        }
        if ((dividend>0 && divisor<0) || (dividend<0 && divisor>0)) {
            c =-c;
        }
        return c;
    }
}

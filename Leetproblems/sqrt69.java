public class sqrt69 {
    public static void main(String[] args) {
        int x = 2147395600;
        
        System.out.println(sqrt(x));
    }

    static int sqrt(int x){
        int l = x;
        int s = 0;
        int mid = 0;

       while (s <= l) {

         mid = s + (l-s)/2;
        if ((long)mid*mid==(long)x) {
            return  mid;
        }
        else if ((long)mid*mid>(long)x){
            l = mid-1;
        }else{
            s = mid+1;
        }

       }

        return  mid-1;
    }
}

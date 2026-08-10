import java.util.Arrays;

class Solution{
    public double findMedian(int [] num1, int [] num2){
        double ans,mid = 0;

        int [] newnum = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, newnum, 0, num1.length);
        System.arraycopy(num2, 0, newnum, num1.length, num2.length);

        Forsort(newnum);
        int d = (newnum.length -1) / 2;
        if (newnum.length%2 == 0) {
             mid = (newnum[d] + newnum[d+1]) / 2.0;
        }else{
            mid = newnum[d];
        }

        return mid;
        

       // return ans;
    }
    public int[] Forsort(int[] newnum){
        for (int i = 0; i < newnum.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (newnum[j] < newnum[j-1]) {
                    insertion(newnum,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        return newnum;
    }
    public int[] insertion(int[] newnum,int second, int first){
        int temp = newnum[first];
       newnum[first]= newnum[second];
        newnum[second] = temp;

        return newnum;
    }
}

public class LEET_4 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {20,2};
        int[] b = {3,30};
        System.out.println(s.findMedian(a,b));
    }
}

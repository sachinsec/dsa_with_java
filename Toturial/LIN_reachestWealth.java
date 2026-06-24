import java.util.Arrays;

public class LIN_reachestWealth {

    public static void main(String[] args) {
        int [][] account = {
            {1,2,3},
            {1,4,3},
            {1,2,1}
        };
        int ans = maximumWealth(account);
        System.out.println(ans);
       
    }

    static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of acunts of person
            //check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
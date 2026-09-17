public class SumClose16 {
    public static void main(String[] args) {
        int [] arr = {0,1,2};
        int t = 3;
        
        System.out.println(threeSumClosest(arr,t));
    }

    static int threeSumClosest(int[] nums, int target) {
        int sum;
        int newsum;
        int size = nums.length-1;
        int l = 0;
        int r = size;
        int mid = 0;
         int d,ans =nums[size] ;

        while (r<0) {

            mid = l + (r - l)/2;

            if (mid==r) {
                r--;
            }

            sum = nums[l]+nums[mid]+nums[r];

            if (ans == target) {
                return ans;
            }

            if (mid!=r) {
                l = mid;
            }
            if (mid==r) {
                r--;
            }

        }
    }
}

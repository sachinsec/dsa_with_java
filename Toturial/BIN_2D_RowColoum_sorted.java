// Stairsearch time consuming compare to Binarysearch

import java.util.Arrays;

public class BIN_2D_RowColoum_sorted {
    public static void main(String[] args) {
        int [][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(check(arr,7)));
    }

    static int[] check(int [][] nums, int target){
        int r = nums.length -1;
        int c = 0;

        while (c < nums.length && r >= 0) {
            if (target == nums[r][c]) {
                return new int[]{r+1,c+1};
            }
            else if (target < nums[r][c]){
                r--;
            }
            else{
                c++;
            }
        }

        return new int[] {-1, -1};
    }
}

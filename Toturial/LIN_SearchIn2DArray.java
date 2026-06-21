import java.util.Arrays;

public class LIN_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {3,8,5,2,9,7},
            {32,53,89,99},
            {81,82},
            {78,98,23,12}
        };

        int target = 12;
        int [] ans= search(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }

}

import java.util.Arrays;

public class LIN_MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {3,8,5,2,9,7},
            {32,53,89,99},
            {81,82},
            {78,98,23,12}
        };

        int ans= search(arr);
        System.out.println(ans);

    }

    static int search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int elements: ints) {
                if (elements>max) {
                    max = elements;
                }
            }
        }
        return max;

    }

}

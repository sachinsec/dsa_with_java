import java.util.ArrayList;
import java.util.Arrays;
public class Container11{

    public static void main(String[] args) {

        int [] arr = {1,8,6,2,5,4,8,3,7};
    }
static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea = currentHeight * width;

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
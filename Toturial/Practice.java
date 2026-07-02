import java.util.Arrays;

/**
 * Practice
 */
public class Practice {
public static void main(String[] args) {

    int [] arr = {2,1,3,4};
    Buble(arr);

    System.out.println(Arrays.toString(arr));
    
}

static void Buble(int [] arr){
  
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i+1; j >  0; j++) {
            if (arr[j] < arr[j-1]) {
                swap(arr, j, j-1);
            }
            else{
                break;
            }
        }
    }

}

static void swap(int [] arr, int second , int start ){

            int temp = arr[second];
               arr[second] = arr[start];
              arr[start] = temp;

}
    
}
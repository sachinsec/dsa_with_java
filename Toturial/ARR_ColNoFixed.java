public class ARR_ColNoFixed {
    public static void main(String[] args) {
        int [][] arr = {
            {1,5,3,6},
            {2,9},
            {9,2,4}

        };
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                 System.out.print(arr[r][c]+"  ");
            }

            System.out.println();
        }

    }
}

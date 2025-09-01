public class Arrays7 {
    public static void main(String[] args) {
        int[][] arr= {
                {1,3,5,6},
                {23,6},
                {12,54,67,98}

        };

        for(int row=0;row<arr.length; row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();

        }
    }
}

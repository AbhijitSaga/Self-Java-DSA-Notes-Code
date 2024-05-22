package ArrayBaseProblem;

import java.util.Arrays;
import java.util.Objects;

public class RotateArray {
    //rotate the array by one position in clock-wise direction.
    /*
    N = 5
    A[] = {1, 2, 3, 4, 5}
    Output:5 1 2 3 4
    */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = 5;
        clockWiseRotate(arr, size, 2);
        System.out.println(Arrays.toString(arr));

    }

    private static void clockWiseRotate(int[] arr, int arraySize, int position) {
       int k=position%arraySize;
        for (int i = 0; i < k; i++) {
          int temp=arr[arraySize-1];
            for (int j = 1; j < arraySize; j++) {
               arr[arraySize-j]=arr[arraySize-1-j];
            }
            arr[0] = temp;


        }
    }
}
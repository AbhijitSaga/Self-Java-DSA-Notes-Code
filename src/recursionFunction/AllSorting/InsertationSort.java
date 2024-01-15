package recursionFunction.AllSorting;

import java.util.Arrays;

public class InsertationSort {
    public static void main(String[] args) {
        int[] arr={7,2,1,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void   sort(int[] arr){
        for(int i=1; i<arr.length;i++){

            while( i>0 && arr[i-1]>arr[i]){
                int temp =arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                i--;

            }
        }
    }
}

package recursionFunction.AllSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,1,8,4,7};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high){
        if(low>high){
            return;
        }
        int start=low;
        int end=high;
        int middle=start+(end-start)/2;
        int pivot=arr[middle];
        while(start<=end){
            while (pivot>arr[start]){
                start++;
            }

            while(pivot<arr[end]){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        sort(arr,low,end);
        sort(arr,start,high);
    }
}

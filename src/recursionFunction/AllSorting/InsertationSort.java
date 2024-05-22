package recursionFunction.AllSorting;

import java.util.Arrays;

public class InsertationSort {
    public static void main(String[] args) {
        int[] arr={7,2,1,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void   sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}

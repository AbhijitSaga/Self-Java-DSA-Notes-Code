package recursionFunction.AllSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,4,9,5,1};
        selectionSortByRecursion(arr, arr.length-1, 0, 0 );
        System.out.println(Arrays.toString(arr));

        int[] arr1={5,2,9,3,6,1};
        selectionSortByLoop(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    private static void selectionSortByRecursion(int[] arr, int r, int c, int IndexOfMax) {
        if(r==0){
          return;
        }

        if(r>=c){
            if(arr[c]>arr[IndexOfMax]){
                IndexOfMax= c;
            }
            selectionSortByRecursion(arr,r,c+1,IndexOfMax);
        }else{
            swapArray(arr,c-1,IndexOfMax);
            selectionSortByRecursion(arr,r-1,0,0);
        }
    }

    private static void swapArray(int[] arr, int c, int indexOfMax) {
        int temp=arr[indexOfMax];
        arr[indexOfMax]=arr[c];
        arr[c]=temp;

    }

    private static void selectionSortByLoop(int[] arr) {

        for(int i=0;i<arr.length;i++){
            int maxIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxIndex]>arr[j]){
                    maxIndex=j;
                }
            }
            swap1(arr,maxIndex,i);
        }
    }

    private static void swap1(int[] arr, int maxIndex, int i) {
        int temp =arr[maxIndex];
        arr[maxIndex]=arr[i];
        arr[i]=temp;
    }


}

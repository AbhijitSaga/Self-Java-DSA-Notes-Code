package recursionFunction.AllSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,7,5,4,1};
        bubbleSortByRecurse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        int[] arr1={2,7,5,4,9,2};
        bubbleSortByLoop(arr1);
        System.out.println(Arrays.toString(arr1));
    }



    private static void bubbleSortByRecurse(int[] arr, int c, int r) {
        if(r<0){
            return;
        }

        if(c<r){
            if(arr[c]>arr[c+1]){
              int temp=arr[c];
              arr[c]=arr[c+1];
              arr[c+1]=temp;
            }
            bubbleSortByRecurse(arr,c+1,r);
        }else{
            bubbleSortByRecurse(arr,0,r-1);

        }
    }



    private static void bubbleSortByLoop(int[] arr1) {
        for(int i=0;i<arr1.length;i++){
           for(int j=1; j<arr1.length-i;j++){
               if(arr1[j]<arr1[j-1]){
                  int temp=arr1[j];
                   arr1[j]=arr1[j-1];
                   arr1[j-1]=temp;
               }
           }
        }
    }
}

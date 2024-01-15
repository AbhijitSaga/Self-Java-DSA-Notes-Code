package recursionFunction.AllSorting.mergeSort;

import java.util.Arrays;

public class MergeSortSomeModifyApproach {
    public static void main(String[] args) {
        int[] arr={7,6,8,3,1,9};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

  private static void mergeSort(int[] arr, int start , int end){
        if(end-start==1){
            return;
        }
        int middle=(end+start)/2;
        mergeSort(arr,start,middle);
        mergeSort(arr,middle,end);
        merge(arr,start,middle,end);
    }

    private static void merge(int[] arr, int start, int middle, int end){
        int[] mixedArray=new int[end-start];
        int i=start;
        int j=middle;
        int k=0;
        while (i<middle&&j<end){
            if(arr[i]>arr[j]){
             mixedArray[k]=arr[j];
             j++;
            }else {
                mixedArray[k]=arr[i];
                i++;
            }
            k++;
        }

        while(i<middle){
            mixedArray[k]=arr[i];
            i++;
            k++;
        }

        while(j<end){
            mixedArray[k]=arr[j];
            j++;
            k++;
        }

        for (int n=0;n<mixedArray.length;n++){
           arr[start+n]= mixedArray[n];
        }
    }
}

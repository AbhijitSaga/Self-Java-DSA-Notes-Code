package recursionFunction.AllSorting.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={4,2,9,1,5};
      int[] ans=  mergeSort(arr);
      System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int middle=arr.length/2;

        int[] first=mergeSort(Arrays.copyOfRange(arr,0,middle));
        int[] second=mergeSort(Arrays.copyOfRange(arr,middle,arr.length));

       return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second){
        int[] newArray=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(first.length>i && second.length>j){
            if(first[i]>second[j]){
                newArray[k]=second[j];
                j++;
            }else{
                newArray[k]=first[i];
                i++;
            }
            k++;
        }

        while(first.length>i){
            newArray[k]=first[i];
            k++;
            i++;
        }

        while(second.length>j){
            newArray[k]=second[j];
            k++;
            j++;
        }
        return newArray;
    }

}

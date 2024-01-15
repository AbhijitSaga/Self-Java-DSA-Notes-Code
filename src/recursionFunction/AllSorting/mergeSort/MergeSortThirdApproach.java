package recursionFunction.AllSorting.mergeSort;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class MergeSortThirdApproach {

    public static void main(String[] args) throws FileNotFoundException {
        int[] arr={5,2,4,9,12,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(end<=start){
            return;
        }
        int middle=(end+start)/2;
        mergeSort(arr,start,middle);
        mergeSort(arr,middle+1,end);
        mixed(arr, start, middle,end);

    }

    private static void mixed(int[] arr, int start, int middle, int end) {



        int[] first=new int[middle-start+1];
        int[] second =new int[end-middle];
        int[] mixedArray=new int[first.length+second.length];

        for(int i=0;i<first.length;i++){
            first[i]=arr[start+i];
        }
        for(int i=0;i<second.length;i++){
            second[i]=arr[middle+i+1];
        }
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<second.length){
            if(first[i]>second[j]){
                mixedArray[k]=second[j];
                j++;
            }else{
                mixedArray[k]=first[i];
                i++;
            }
            k++;
        }

        while (i<first.length){
            mixedArray[k]=first[i];
            i++;
            k++;
        }

        while (j<second.length){
            mixedArray[k]=second[j];
            j++;
            k++;
        }

        for(int p=0; p<mixedArray.length;p++ ){
            arr[start+p]=mixedArray[p];
        }
    }

}

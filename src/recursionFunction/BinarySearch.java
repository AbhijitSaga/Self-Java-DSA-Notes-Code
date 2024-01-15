package recursionFunction;

import java.io.FileNotFoundException;

public class BinarySearch {
    public static void main(String[] args) throws FileNotFoundException {
        //first approach
        int[] arr={1,2,3,4,5,7,9};
        int target =5;
        int targetIndex=  binarySearch(arr,target);
        System.out.println(targetIndex);

       //second approach
       int targetIndx= binarySearchByRecursion(arr,target,0,arr.length-1);
       System.out.println(targetIndx);
    }

    public static int binarySearch(int[] arr, int target){
        if(arr.length<1){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;


            if(arr[middle]<target){
                start=middle+1;
            }else if(arr[middle]>target){
                end=middle-1;
            }else{
                return middle;
            }
        }
        return -1;
    }


    private static int binarySearchByRecursion(int[] arr, int target, int start, int end) {
        int middle=(end+start)/2;

        if(arr[middle]>target){
            return   binarySearchByRecursion(arr,target,start,middle-1);
        }else if(arr[middle]<target){
            return binarySearchByRecursion(arr,target,middle+1,end);
        }
        return middle;
    }
}

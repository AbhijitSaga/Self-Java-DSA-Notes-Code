package recursionFunction;

public class SortedCircularArrayBinarySearch {

    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,11,12,1,2,3};

        int target=11;
        int res=binarySearch(arr,0,arr.length-1,target);
        System.out.println(res);
    }

    public static  int binarySearch(int[] arr, int start ,int end, int target){
         int middle=start+(end-start)/2;
        if(arr[middle]==target){
            return middle;
        }

        if(arr[middle]>=arr[start]){
            if(arr[middle]>target && arr[start]>=target){
               return binarySearch(arr,start,middle-1,target);
            }else{
                return binarySearch(arr,middle+1,end,target);
            }
        }

        if(arr[middle]<=target && arr[end]>=target){
            return binarySearch(arr,middle+1,end,target);
        }

        return binarySearch(arr,start,middle-1,target);
    }
}

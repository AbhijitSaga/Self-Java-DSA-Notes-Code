package recursionFunction;

public class IsSortedCheck {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8,9,12,14};
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr, int i) {
        if(arr[i]==arr.length-1){
            return  true;
        }
        return  arr[i]<arr[i+1] && isSorted(arr, i+1);
    }
}

package ArrayBaseProblem;

import java.util.Arrays;

/*
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower.
After the operation, the resultant array should not contain any negative integers.
*/
public class MinimizeDiffTheHeights {
    public static void main(String[] args) {
       int K = 3, N = 5;
       int arr[] = {3, 9, 12, 16, 20};
       int res= getMinDiff(arr,N,K);
       System.out.println(res);
    }

    private static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int minDiff=arr[n-1]-arr[0];
        int min, max;

        for(int i=1;i<n;i++){
            if(arr[i]-k<0)
                continue;
             min=Math.min(arr[i]-k,arr[0]+k);
             max=Math.max( arr[i-1]+k ,arr[n-1]-k);

             minDiff=Math.min(minDiff,max-min);
        }
        return minDiff;

    }
}

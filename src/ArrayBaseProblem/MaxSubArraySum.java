package ArrayBaseProblem;

public class MaxSubArraySum {

    public static void main(String[] args)  {
        int   n = 5;
        int   arr[] = {1,2,3,-2,5};

        int sum=    maxSubArraySum(arr, n);
        System.out.println(sum);

    }

    private static int maxSubArraySum(int[] arr, int n) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){

            sum = Math.max(sum+arr[i], arr[i]);
            maxSum = Math.max(maxSum, sum);

        }

        return maxSum;
    }
}

package recursionFunction;

public class CountAnumber {
    public static void main(String[] args) {
        // count how many zero exist in number
        int n=790203506;
        int zeroCount=count(n);
        System.out.println(zeroCount);
    }

    private static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if(n==0){
            return count;
        }

        if(n%10==0){
           return helper(n/10,count+1);
        }else{
           return helper(n/10,count);
        }
    }
}

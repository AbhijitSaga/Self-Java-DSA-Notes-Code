package StringBasedProblem;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs, int i , int j) {
        if (i==j) {
            return strs[i];
        }else {
            int middle = (i + j) / 2;

            String st = longestCommonPrefix(strs, i, middle);
            String st1 = longestCommonPrefix(strs, middle+1, j);
            return longestCommonString(st, st1);
        }
    }

    private static String longestCommonString(String st, String st1) {
        int lowestSizeOfString =Math.min(st.length(),st1.length());

        for(int i=0; i<lowestSizeOfString;i++){
         if(st.charAt(i)!=st1.charAt(i)){
          return st.substring(0,i);
         }
        }
        return st.substring(0, lowestSizeOfString);
    }


    /* Driver Function to test other function */
    public static void main(String[] args)
    {

        String[] input = {"geeksforgeeks", "gepeks", "geek"};
        System.out.println( "The longest Common Prefix is : " +
                longestCommonPrefix(input,0, input.length-1));
    }
}

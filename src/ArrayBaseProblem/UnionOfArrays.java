package ArrayBaseProblem;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] arr={5, 3};
        int[] arr1={1,2, 3, 4, 5};
        int[] arr2={1, 2, 3};
        int[] tempArray=new int[arr.length+arr1.length+arr2.length];

        System.arraycopy(arr,0,tempArray,0,arr.length);
        System.arraycopy(arr1,0,tempArray,arr.length,arr1.length);
        System.arraycopy(arr2,0,tempArray,arr.length+arr1.length,arr2.length);
        Arrays.sort(tempArray);


      int i=0,j=1,count=0;
      while (i<tempArray.length && j<tempArray.length){
         if(tempArray[i]==tempArray[j]){
             i++;
             j++;
         }else if(tempArray[i]!=tempArray[j]){
             i++;
             j++;
             count++;
         }

      }

      while (i<tempArray.length){
          i++;
          count++;
      }

        while (j<tempArray.length){
            j++;
            count++;
        }
     System.out.println(count);


    }

}

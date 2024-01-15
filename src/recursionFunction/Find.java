package recursionFunction;

import java.util.ArrayList;
import java.util.List;

public class Find {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,7,17,9};
        int  target=7;
        System.out.println(find(arr,target,0));
        System.out.println(findTargetIndexFirst(arr,target,0));
        System.out.println(findTargetIndexLast(arr,target,arr.length-1));
        List resultList= findAllIndex(arr,target,0,new ArrayList());
        System.out.println(resultList);

        System.out.println(findAllIndexSecondApproach(arr,target,0));

    }



    static boolean find(int[] arr, int target,int index){
        if(index==arr.length-1){
            return false;
        }
        return  arr[index]==target || find(arr,target,index+1);
    }


    private static int findTargetIndexFirst(int[] arr, int target, int index) {
        if(arr[index]==target){
            return index;
        } else if (index==arr.length-1) {
            return -1;
        }
        return  findTargetIndexFirst(arr,target,index+1);
    }


    private static int findTargetIndexLast(int[] arr, int target, int index) {
        if(index==-1) {
            return -1;
        }else if(arr[index]==target){
            return  index;
        }
        return findTargetIndexLast(arr,target,index-1);
    }


  //static   ArrayList<Integer> list=new ArrayList<>();
    private static List findAllIndex(int[] arr, int target, int index, List list) {
        if(arr.length==index){
            return list;
        } else if (arr[index]==target) {
            list.add(index);
        }
         findAllIndex(arr, target,index+1,list);
        return list;
    }


    private static List<Integer> findAllIndexSecondApproach(int[] arr, int target, int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length-1){
            return list;
        }else if(arr[index]==target){
            list.add(index);
        }

      List<Integer> ansForBelowCall=  findAllIndexSecondApproach(arr,target,index+1);
        list.addAll(ansForBelowCall);
        return list;
    }

}

package recursionFunction;

import java.util.ArrayList;
import java.util.List;

public class StringSequenceAndNumberSubSetAndPermutation {
    public static void main(String[] args) {
        //string sub sequence problem
       ArrayList<String> res= StringSubSequence("","abc");
       System.out.println(res);

      //number sub set problem
        int[] no={1,2,3};
       List<ArrayList<Integer>> list=numberSubSet(no);
       System.out.println(list);

       //permutation
    ArrayList<Integer> resP= permutation("","123");
    System.out.println(resP);
    }



    private static ArrayList<String> StringSubSequence(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> arrayList=new ArrayList<>();
            arrayList.add(p);
            return arrayList;
        }
     ArrayList st1= StringSubSequence(p+up.charAt(0), up.substring(1));
     ArrayList st2=  StringSubSequence(p, up.substring(1));
        st1.addAll(st2);
        return st1;

    }



    private static List<ArrayList<Integer>> numberSubSet(int[] number) {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        for(int n:number){
            int noItr=outer.size();
           for(int i =0; i<noItr;i++){
               ArrayList inner=new ArrayList(outer.get(i));
               inner.add(n);
               outer.add(inner);
           }
        }
        return outer;
    }


    private static ArrayList<Integer> permutation(String p, String up) {
        ArrayList<Integer> listOuter=new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(Integer.parseInt(p));
            return list;
        }
        char ch=up.charAt(0);
        for(int i=0;i<= p.length();i++){
            String f= p.substring(0,i);
            String s=p.substring(i,p.length());
         ArrayList<Integer> res=   permutation(f+ch+s,up.substring(1));
         listOuter.addAll(res);
        }
        return listOuter;
    }
}

package recursionFunction.backtracking;

import java.util.ArrayList;

//Question- Find all possible routes in the maze where you can move horizontally, vertically, and diagonally
public class MazeProblemSecond {

    public static void main(String[] args) {
        mazeMethod("",3,3);

   ArrayList<String> res=mazeMethodAndResponse("",3,3);
   System.out.println(res);
    }



    private static void mazeMethod(String p, int r, int c) {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
           mazeMethod(p+'H',r-1,c);
        }
        if(r>1&&c>1){
         mazeMethod(p+'D',r-1,c-1);
        }
        if(c>1){
           mazeMethod(p+'V',r,c-1);
        }
    }



    private static ArrayList<String> mazeMethodAndResponse(String p, int r, int c) {
        if(r==1 && c==1){
            ArrayList<String> inner=new ArrayList<>();
            inner.add(p);
            return inner;
        }
        ArrayList<String> outer=new ArrayList<>();
        if(r>1){
         outer.addAll( mazeMethodAndResponse(p+'H',r-1,c));
        }
        if(r>1&&c>1){
            outer.addAll( mazeMethodAndResponse(p+'D',r-1,c-1));
        }
        if(c>1){
            outer.addAll( mazeMethodAndResponse(p+'V',r,c-1));
        }
        return outer;
    }
}

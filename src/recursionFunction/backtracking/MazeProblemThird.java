package recursionFunction.backtracking;

import java.util.ArrayList;

/*
Question->In the maze problem, we can find a path where we can move vertically and horizontally,
 but we are not allowed to traverse positions that are marked as false.
*/
public class MazeProblemThird {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        mazePossiblePath( maze,"",0,0);
     ArrayList<String> response=   mazePossiblePathAndResponse( maze,"",0,0);
     System.out.println(response);
    }



    private static void mazePossiblePath(boolean[][] maze, String p , int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
          System.out.println(p);
          return;
        }
        if(!maze[r][c]){
            return;
        }
        if(  r<maze.length-1 ){
            mazePossiblePath(maze, p+'H',r+1, c);
        }
        if( c<maze[0].length-1 ){
            mazePossiblePath(maze, p+'V',r, c+1);
        }


    }

    private static ArrayList<String> mazePossiblePathAndResponse(boolean[][] maze, String p, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> inner=new ArrayList<>();
            inner.add(p);
            return inner;
        }
        if(!maze[r][c]){
         return new ArrayList<>();
        }
        ArrayList<String> outer=new ArrayList<>();

        if(r<maze.length-1 ){
           outer.addAll( mazePossiblePathAndResponse(maze,p+'V', r+1,c));
        }
        if(c<maze[0].length-1 ){
           outer.addAll( mazePossiblePathAndResponse(maze,p+'H', r,c+1));
        }
        return outer;
    }

}

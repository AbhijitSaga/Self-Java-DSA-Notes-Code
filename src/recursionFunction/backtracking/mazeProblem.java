package recursionFunction.backtracking;
//Question-Find all possible routes in the maze where you can move horizontally, vertically
public class mazeProblem {
    public static void main(String[] args) {
      int result=  numberOfWays(3,3);
      System.out.println(result);

        mazePath("",3,3);
    }

    private static int numberOfWays(int r, int c) {
        if(r==1||c==1){
            return 1;
        }

      int count1=  numberOfWays(r-1,c);
      int count2=  numberOfWays(r,c-1);

      return count1+count2;
    }


    private static void mazePath(String p, int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
          mazePath(p+'R',r-1,c);
        }
        if(c>1){
          mazePath(p+'D',r,c-1);
        }
    }
}

package recursionFunction.backtracking.backTrackingProblem;

public class BackTracking {

        //

        public static void main(String[] args) {
            boolean[][] path={
                    {true,true,true},
                    {true,true,true},
                    {true,true,true}
                    };

            mazePath1(path,"",0,0);
        }

        private static void mazePath1(boolean[][] path,String p, int c, int r) {
            if( c==path[0].length-1 &&  r== path.length-1){
                System.out.println(p);
               return;
            }
            if(path[c][r]==false){
                return ;
            }

            path[c][r]=false;

            if(c<path[0].length-1){
                mazePath1(path,p+'R',c+1,r);
            }
            if(r< path.length-1){
                mazePath1(path,p+'D',c,r+1);
            }
            if(c>0){
                mazePath1(path,p+'L',c-1,r);
            }
            if(r>0){
                mazePath1(path,p+'U',c,r-1);
            }
            path[c][r]=true;

        }

    }


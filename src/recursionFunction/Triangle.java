package recursionFunction;

public class Triangle {
    public static void main(String[] args) {
      //  triangle(4,0);
        triangle2(4,4);
    }

    private static void triangle(int r, int c) {
        if(r<=0){
          return;
        }
        if(r>c){
            System.out.print("*");
             triangle(r,c+1);
        }else{
            System.out.println();
           triangle(r-1,0);
        }
    }

    private static void triangle2(int r, int c) {
        if(r<=0){
            return ;
        }

        if(c>=r){
            System.out.print("*");
            triangle2(r,c-1);
        }else{
            System.out.println();
            triangle2(r-1,4);
        }

    }
}

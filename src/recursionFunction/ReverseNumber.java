package recursionFunction;

public class ReverseNumber {

    public static void main(String[] args) {
        int no=1233231;
        String n=String.valueOf(no);
     boolean result=palin(n,0,n.length()-1);
     System.out.println(result);
    }

    private static boolean palin(String number,int s, int e) {

   if(number.charAt(s)!=number.charAt(e)){
       return false;
   }
    if(e<=s){
        return true;
    }
    return     palin(number,s+1,e-1);


    }
}
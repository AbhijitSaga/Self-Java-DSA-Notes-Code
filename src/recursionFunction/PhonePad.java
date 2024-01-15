package recursionFunction;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
       phonePad("","23");
     ArrayList result=  phonePadWithReturn("","23");
     System.out.println(result);
    }



    private static void phonePad(String p,String up) {
   if(up.isEmpty()){
   System.out.println(p);
   return ;
   }

        int digit=up.charAt(0)-'1';

        for(int i=(digit-1)*3;i<(digit)*3;i++){
            char ch= (char)('a'+i);
            phonePad(p+ch,up.substring(1));
        }
    }

    private static ArrayList phonePadWithReturn(String p, String up) {
        if(up.isEmpty()){
            ArrayList inner=new ArrayList();
            inner.add(p);
            return inner;
        }
        ArrayList outer =new ArrayList();
        int digit =up.charAt(0)-'1';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ArrayList res=phonePadWithReturn(p+ch,up.substring(1));
            outer.addAll(res);
        }
        return outer;
    }
}

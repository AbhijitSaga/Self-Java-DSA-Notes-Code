package recursionFunction;

import java.util.Arrays;

public class StringMethod {
    //char str.charAt(index);
    //boolean str.equal(str1)
    //boolean str.equalsIgnoreCase(str1);
    //String[] str.split("//s");
    // string str.contains(str1);
    // String str.subString(startIndex);
    // String str.subString(startIndex,endIndex);
    // String String.join(":","2","4","2023");
    //int str.length();
    //boolean str.isEmpty();
    //boolean str.concat(str1);
    //boolean  str.containsIgnoreCase(str1);
    //String str.replace(old char, new char);
    //String str.replace(old charSequence, new charSequence);
    // strObject.intern()->string object to literal
    //char[] str.toCharArray();
    public static void main(String[] args) {
        String str="abhijt sagar";
        System.out.println("stringLength: "+str.length());
        System.out.println("charAt(): "+str.charAt(0));
        System.out.println("subString(startIndex) "+str.substring(0));
        System.out.println("SubString(startIndex,endIndex)"+ str.substring(1,3));
        System.out.println("join()"+ String.join(":","12","11","2023"));
        System.out.println("String[] split() "+ Arrays.toString(str.split(" ")));
        System.out.println("concate() " + str.contains("sagar"));
        System.out.println("equals() "+ str.equals("abhijt sagar") );
        System.out.println("equalsIgnoreCase()"+ str.equalsIgnoreCase(" Abhijt Sagar"));
        System.out.println("isEmpty() "+ str.isEmpty());
        System.out.println("replace() " +str.replace('a','A'));
        System.out.println("replace()"+str.replace("bh","BH"));
        System.out.println("concate()"+str.concat("Yadav"));
        System.out.println("intern() "+str.intern());

    }
}

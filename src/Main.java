import java.util.*;



public class Main {
    public static void main(String[] args)  {

        /*For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).*/
        String st="[()]{}{[()()]()}";
       boolean i =getMi(st);
        System.out.println(i);

    }

    private static boolean getMi(String st) {
      Stack<Character> stack=new Stack();
      for(int i=0;i<st.length();i++){
              if(stack.size()>0) {
                  if (stack.peek().equals('(')) {
                      if (st.charAt(i) == ')') {
                          stack.pop();
                      } else {
                          stack.push(st.charAt(i));
                      }
                  } else if (stack.peek().equals('{')) {
                      if (st.charAt(i) == '}') {
                          stack.pop();
                      } else {
                          stack.push(st.charAt(i));
                      }
                  } else if (stack.peek().equals('[')) {
                      if (st.charAt(i) == ']') {
                          stack.pop();
                      } else {
                          stack.push(st.charAt(i));
                      }
                  }

              }else{
              stack.push(st.charAt(i));
          }
      }
    return   stack.size()==0?true:false;

    }


}


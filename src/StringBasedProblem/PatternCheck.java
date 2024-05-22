package StringBasedProblem;

import java.util.Stack;

public class PatternCheck {
    public static void main(String[] args) {

        /*For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).*/
        String st="[()]{}{[()()]()}";
        boolean i =patterCheck(st);
        System.out.println(i);
    }

    private static boolean patterCheck(String st) {

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

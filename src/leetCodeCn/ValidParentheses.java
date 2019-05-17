package leetCodeCn;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] chars=s.toCharArray();
        for (char aChar :chars){
            if (stack.size()==0){
                stack.push(aChar);
            }else if(isSym(stack.peek(),aChar)){
                stack.pop();
            }else {
                stack.push(aChar);
            }
        }
        return stack.size()==0;
    }
    public boolean isSym(char c1,char c2){
        return (c1=='('&&c2==')')||(c1=='['&&c2==']')||(c1=='{'&&c2=='}');
    }
}

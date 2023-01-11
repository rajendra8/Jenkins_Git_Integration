package Java_code;

import java.util.Stack;

public class BalancedExpression {
    String in="{[()]}";// balanced

    public boolean test(String in){
        Stack<Integer>stack=new Stack<>();

        for (int i = 0; i <in.length() ; i++) {
            char ch=in.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(i);
            else if (ch == ')'|| ch == ']' || ch == '}')
            {
                //nothing to match with
                if(stack.isEmpty())
                {
                    return false;
                }
                else if(stack.pop() != ch)
                {
                    return false;
                }

            }
        }
    return true;
    }
}

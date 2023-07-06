package LeetCode;

import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parentheses {

    String in="[(]))]}{[()]}";
   // String in="123456";
    //then return balanced else unbalanced

    @Test
    public void parenthesesOrder(){
        Deque<Character>stack=new ArrayDeque<>();

        for(final char c: in.toCharArray() ){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }
            else if(stack.isEmpty()|| stack.pop()!=c){

                System.out.println("unbalanced");
            }
            System.out.println(stack.isEmpty()+"balanced");
        }

        System.out.println(stack);

    }

    @Test
    public void checkStack(){
        Deque<Character> stack=new ArrayDeque<>();
        for(char c:in.toCharArray()){
          stack.push(c);
            System.out.println(stack);
        }
    }


    @Test
    public void deque(){
        String[] name={"rajendra,sahu"};
        Deque<Character> stack=new ArrayDeque<>();
        stack.addFirst('a');
        stack.addFirst('b');
        stack.push('c');
        stack.offer('d');
        stack.addLast('z');
        stack.addFirst('x');
        System.out.println(stack);
        for(char c:in.toCharArray()){
            stack.push(c);
           // System.out.println(stack);
        }
    }
}

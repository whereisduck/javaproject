package StackAndQueque;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String p = "{(}";
        System.out.println(isBalanced(p));

    }

    public static boolean isBalanced(String exp) {

        //Iterate through the string exp.
        //For each opening parentheses, push it into stack
        //For every closing parenthesis check for its opening parentheses in stack
        //If you can't find the opening parentheses for any closing one then returns false.
        //and after complete traversal of string exp, if there's any opening parentheses left
        //in stack then also return false.
        //At the end return true if you haven't encountered any of the above false conditions.
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char character = exp.charAt(i);

            if (character == '}' || character == ')' || character == ']') {

                if (stack.isEmpty()) return false;

                if ((character == '}' && stack.pop() != '{') || (character == ')' && stack.pop() != '(') || (character == ']' && stack.pop() != '[')) return false;
                else continue;

            }
            else stack.push(character);

        } //end of for
        if (!stack.isEmpty()) return false;

        return true;
    }



/*
    // if char is left parentheses: stack push
    // stack is not empty &&  char is right parentheses and stack.pop() is paired  left ==> pop(), else false}
    // stack is empty && char is left : push, else false.}
    static boolean isBalanced (String parentheses){
        Stack<Character> temp = new Stack<>();
        if (parentheses==null){
            return false;
        }
        for (int i = 0; i<parentheses.length(); i++){
            char x = parentheses.charAt(i);
            if (!temp.isEmpty()){
                if (x ==')' || x==']'||x=='}'){
                    if ((x ==')' && temp.pop()!='(' )|| (x==']' && temp.pop() !='[' )|| (x=='}' && temp.pop() != '{' ))
                    return false;

                   else continue; //TODO why need this line?
                }
                temp.push(x);}
            else {
                if (x==')' || x==']' || x=='}'){
                    return false;
                }else temp.push(x);}

            }


        if (temp.isEmpty()){


        return true;} else
        {return false;}
    }


 */

}

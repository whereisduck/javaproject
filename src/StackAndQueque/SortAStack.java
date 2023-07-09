package StackAndQueque;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        // This is the temporary stack
        Stack<Integer> tmpStack=sortStack(input);
        System.out.println("Sorted numbers are:");
        while(!tmpStack.isEmpty()){
            System.out.println(tmpStack.pop());
        }

    }
    static Stack<Integer> sortStack(Stack<Integer> stack){
        Stack<Integer> temp =new Stack<>();
        while (!stack.isEmpty()){
            int x = stack.pop();
            while(!temp.isEmpty() && temp.peek() > x){
                stack.push(temp.pop());
            }
            temp.push(x);

        }

        return temp;

    }
}

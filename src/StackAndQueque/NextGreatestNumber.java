package StackAndQueque;

import java.util.Stack;

public class NextGreatestNumber {
    public static void main(String[] args) {
        int[] input = {2, 4, 6, 3, 5, 8,};
        int[] t = nextGreater(input);
        for(int i : t){
        System.out.println(i);}

    }
    static int[] nextGreater (int[] arr){
        if (arr==null){return null;}
        int[] result = new int[arr.length];
        Stack<Integer> temp = new Stack<>();
        //temp.push(arr[0]);
        for(int i = arr.length-1 ; i >=0 ; i--){
            if(!temp.isEmpty()){
                while(!temp.isEmpty() && arr[i] >= temp.peek()){
                    temp.pop();
                }


            }
            if (temp.isEmpty()){
                result[i] =-1;
            }
            else result[i] = temp.peek();
            temp.push(arr[i]);


        }

        return result;
    }
}

package com.company;


import java.util.Stack;

public class Main{

    public static int getPriority(char a){
        switch (a){
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            case '^':
                return 3;
            default:
                return -1;
        }
    }



    public static void  main(String[] args)
    {

        String str= "a+b*(c^d-e)^(f+g*h)-i";
        String result = "";

        Stack<Character> stack1= new Stack<Character>();

        for(int i=0;i<str.length();i++){
            char val=str.charAt(i);
            if(Character.isLetterOrDigit(val)){
                result+=val;
            }
            else{
                if(stack1.isEmpty()){
                    stack1.push(val);
                }
                else{
                    if(val=='('){
                        stack1.push(val);
                    }
                    else if(val==')'){
                        while(!stack1.isEmpty() && stack1.peek()!='('){
                            result+=stack1.pop();
                        }
                        //if it contained ) it should have contained ( also so remove the ( from the stack
                        if(stack1.isEmpty()){
                            //that means there was no (
                            System.out.println("Expression wrong");
                        }
                        else{
                            //) is popped
                            stack1.pop();
                        }
                    }
                    else{
                        if(getPriority(val)<=getPriority(stack1.peek()) && stack1.peek()!='('){
                            while(!stack1.isEmpty() && getPriority(val)<=getPriority(stack1.peek()) && stack1.peek()!='(' ){
                                result+=stack1.pop();

                            }
                            stack1.push(val);
                        }
                        else{
                            stack1.push(val);
                        }
                    }
                }
            }
            System.out.println("after every loop");
            System.out.println("string is " + result);
            //System.out.println("element in stack is "+ ststack1.peek());
        }
        for(int i=0;i<stack1.size();i++){
            result+=stack1.pop();
        }

        System.out.println(result);






    }



}
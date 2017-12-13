package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        // write your code here

        /*try{*/
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            //Stack<Integer> s = new Stack<Integer>();
            Queue<Integer> q = new LinkedList<>();

            int len = Integer.parseInt(scanner.nextLine());
            System.out.println("length is " + len);
            String[] numstr = scanner.nextLine().split(" ");
            System.out.println(numstr[0]);
            System.out.println("this is "+ i + "turn" );
            int[] nums = new int[len];

            //int secondLastValIndex = 0;
            int min=0;
            //int change=0;
            for(int k=0;k<len;k++){
                nums[k]= Integer.parseInt(numstr[k]);

            }
            System.out.println("yahaaaaaaa");
            for(int j=len-1;j>-1;j--){
                int k= nums[j];
                //System.out.println(k);
                if(k>min){
                    min=k;
                    q.add(k);
                }
                else{
                    break;}

            }
            System.out.println("reached here");
            // System.out.println(nums.length);
            //System.out.println(q.size());
            if(nums.length!=q.size()){
                int index = nums.length-q.size() - 1;
                //System.out.println(index);
                int valatindex = nums[index];
                while (!q.isEmpty()){
                    if(valatindex>q.peek()){
                        nums[index]=q.remove();
                        index+=1;
                    }
                    else{
                        nums[index]=valatindex;
                        index+=1;
                        while(!q.isEmpty()){
                            nums[index]=q.remove();
                            index+=1;
                        }
                        break;
                    }
                }

                //System.out.println("yha bhi hu");


                    /*for (int j = 0; j < nums.length; j++) {
                        System.out.print(nums[j] + " ");
                    }*/




            }
            for (int j = 0; j < nums.length; j++) {
                System.out.println(nums[j]);
            }

            //System.out.println("the i is now" + i);
        }
       /* }
        catch (Exception e){
            //System.out.println(e);
            System.exit(0);
        }*/

    }
}

package com.company;


import java.util.Scanner;
import java.util.Stack;

public class Main{

    /*Example of greedy algorithm*/

/*Activity Selection Problem - You are given n activities with their start and finish times.
Select the maximum number of activities that can be performed by a single person, assuming that
a person can only work on a single activity at a time.*/



    public static void  main(String[] args)
    {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        int j =0;
        System.out.println(j);
        for(int i=j+1;i<finish.length;i++){
            if(finish[j]<=start[i]){
                System.out.println(i);
                j=i;
            }
        }



    }



}
package com.company;


import java.util.Scanner;
import java.util.Stack;

public class Main{





    public static void  main(String[] args)
    {
        try {
            while (1 == 1) {
                boolean result = true;
                Scanner sc = new Scanner(System.in);
                int n = Integer.parseInt(sc.nextLine());
                if (n == 0) break;
                String str = sc.nextLine();
                //System.out.println(str);
                String[] s = str.split(" ");
                int[] a = new int[s.length];
                for (int i = 0; i < a.length; i++) {
                    a[i] = Integer.parseInt(s[i]);
                }

                Stack<Integer> stack1 = new Stack<Integer>();
                Stack<Integer> b = new Stack<Integer>();
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        if (stack1.isEmpty())
                            stack1.push(a[i]);
                        else {
                            if (a[i] <= stack1.peek()) {
                                stack1.push(a[i]);
                            } else {
                                System.out.println("no");
                                result = false;
                                break;
                            }
                        }
                    } else {
                        b.push(a[i]);
                    }
                }
                if (result == false) {
                    continue;
                } else {
                    System.out.println("yes");

                }


            }
        }
        catch (Exception e){
            System.exit(0);
        }



    }



}
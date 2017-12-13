


import com.sun.jdi.IntegerType;

import java.util.Scanner;
import java.util.Stack;

public class Main{


    public static void  main(String[] args) throws java.lang.Exception
    {
        try{
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            //System.out.println("asdad");
            for(int i=0;i<n;i++){
                boolean result = true;

                int len = Integer.parseInt(scanner.nextLine());
                String[] arr= scanner.nextLine().split(" ");
                int num=1;
                if(Integer.parseInt(arr[0])!=num){
                    result=false;
                }
                //System.out.println(i);
                for(int j=0;j<arr.length;j++){
                    int value=Integer.parseInt(arr[j]);
                    //System.out.println(arr[len-j-1]);
                    int oppvalue=Integer.parseInt(arr[len-j-1]);
                /*System.out.println(value);
                System.out.println(oppvalue);*/
                    if(value==oppvalue) {
                        if(len%2==0){
                            if ((value == num || value == num + 1)  && j <= (len / 2)-1) {
                                num = value;
                            } else if ((value == num || value == num - 1) && j > (len / 2)-1) {
                                num = value;
                            } else {
                                result = false;
                            }
                        }
                        else{
                            //System.out.println((len/2)+1);

                            if ((value == num || value == num + 1)  && j <= (len/2)) {
                                num = value;
                            } else if ((value == num || value == num - 1) && j > (len / 2)) {
                                num = value;
                            } else {
                                result = false;
                            /*System.out.println("here");
                            System.out.println(value);
                            System.out.println(num);
                            System.out.println(j);*/
                            }
                        }
                    }

                    else{
                        result=false;
                    }

                }
                if(result==false){
                    System.out.println("no");
                }
                else{
                    System.out.println("yes");
                }

            }
        }
        catch(Exception e){
            System.exit(0);
        }



    }







}
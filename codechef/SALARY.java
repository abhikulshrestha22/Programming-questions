import com.sun.jdi.IntegerType;

import java.util.Scanner;
import java.util.Stack;

public class Main{


    public static void  main(String[] args) throws java.lang.Exception
    {
        try{
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            for(int i=0;i<n;i++){
                //System.out.println(i);
                int workers = Integer.parseInt(scanner.nextLine());
                int sum=0;

                String[] salariesArr= scanner.nextLine().split(" ");
                int min=Integer.parseInt(salariesArr[0]);
                for (int j=0;j<workers;j++){
                    int salInt = Integer.parseInt(salariesArr[j]);
                    sum+=salInt;
                    //System.out.println(salInt);
                    if(min>salInt){
                        min=salInt;
                    }
                    //System.out.println(min);
                }
                System.out.println();
                System.out.println(sum-(workers*min));

            }
        }
        catch(Exception e){
            System.exit(0);
        }



    }







}
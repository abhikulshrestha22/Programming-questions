


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
                String a = scanner.nextLine();
                boolean lucky=false;
                String[] numbers = a.split(" ");
                int poetryLength = Integer.parseInt(numbers[0]);
                int currentNBLength = Integer.parseInt(numbers[1]);
                int budget = Integer.parseInt(numbers[2]);
                int booksPresent = Integer.parseInt(numbers[3]);
                for(int j=0; j<booksPresent;j++){
                    String b= scanner.nextLine();
                    String[] num = b.split(" ");
                    int bookLength = Integer.parseInt(num[0]);
                    int bookCost = Integer.parseInt(num[1]);
                    if(bookLength>=poetryLength-currentNBLength && bookCost<=budget){
                        //System.out.println("LuckyChef");
                        lucky=true;
                        //break;
                    }
                }

                if(!lucky)
                    System.out.println("UnluckyChef");
                else
                    System.out.println("LuckyChef");

            }
        }
        catch(Exception e){
            System.exit(0);
        }



    }







}
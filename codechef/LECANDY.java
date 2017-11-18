


import java.util.Scanner;
import java.util.Stack;

public class Main{


    /*Question Link   https://www.codechef.com/problems/LECANDY */

    public static void  main(String[] args)
    {
        try{
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            for(int i=0;i<n;i++){
                String a = scanner.nextLine();
                String[] numbers = a.split(" ");
                int elephants = Integer.parseInt(numbers[0]);
                int candies = Integer.parseInt(numbers[1]);
                String b = scanner.nextLine();
                String[] candiesPerElephant = new String[elephants];
                candiesPerElephant=b.split(" ");

                int totalCandiesElephantsWant=0;
                for(int j=0;j<elephants;j++){
                    totalCandiesElephantsWant+=Integer.parseInt(candiesPerElephant[j]);
                }
                //System.out.println(totalCandiesElephantsWant);
                if(totalCandiesElephantsWant>candies){
                    System.out.println("No");
                }
                else {
                    System.out.println("Yes");
                }

            }
        }
        catch(Exception e){
            System.exit(0);
        }



    }







}
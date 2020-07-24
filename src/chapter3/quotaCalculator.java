package chapter3;
/*
IF and ELSE
 */

import java.util.Scanner;

public class quotaCalculator {
    public static void  main(String[] args)
    {
        // Initialize values that we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales that you made");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision path to take - Output
        if(sales >= quota)
        {
            System.out.println("Congrats! You met your quota");
        }
        else
        {
            int salesShort = (quota - sales);
            System.out.println("Sorry! You need to work hard, and need to sell plus:  " + salesShort);
        }
    }
}

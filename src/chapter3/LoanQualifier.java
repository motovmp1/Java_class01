package chapter3;

/*
nested if
 */


import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args)
    {
        // Variables know
        int requiresSalary = 30000;
        int requiresYears = 2;

        //Get the value for key
        System.out.println("Enter the salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter how many years: ");
        double years = scanner.nextDouble();
        scanner.close();

        //make the decision
        if (salary >= requiresSalary)
        {
            if(years >= requiresYears)
            {
                System.out.println("You are the best!");
            }
            else
            {
                double yearsNeed = (requiresYears - years);
                System.out.println("You have the salary, but not the time, you need more: " + yearsNeed);

            }
        }
        else
        {
            System.out.println("Sorry, salary not enough");

        }

    }

}

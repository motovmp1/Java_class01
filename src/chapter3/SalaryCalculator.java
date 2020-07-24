package chapter3;
/*
This is a nem comments
 */


import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String[] args)
    {
        // Initialize know values
        double salary = 1000;
        double bonus = 250;


        // Get values for the unknown
        System.out.println("How many did employee did this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //quick detour for the bonus
        // if apenas verifica se vale, senao ele passa direto
        if(sales > 10)
        {
            salary = (salary + bonus);
        }


        //output
        System.out.println("Congrat your salary is :" + salary);





    }

}

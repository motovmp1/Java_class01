package chapter2;
// quando tiver package precisa compilar dentro da pasta certa


import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args)
    {
        //1. get the number of hours
        System.out.println("Enter the value of hour the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();


        //2. get the hourly pay rate
        System.out.println("Enter the employee pay rate");
        double pay = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = (hours * pay);


        // 4. Display the result
        System.out.println("This is a the final salary: " + grossPay);


    }

}

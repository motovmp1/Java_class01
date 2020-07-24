package charpter4;
/*
do while loop
 */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args){
        // variables
        boolean again;
        Scanner scanner = new Scanner(System.in);
        // do while
        do{
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = (num1 + num2);

            System.out.println("The sum final is : " + result);

            System.out.println("Do you want to run again type true, otherwise type false");
            again = scanner.nextBoolean();

        }while(again);
        scanner.close();
    }

}

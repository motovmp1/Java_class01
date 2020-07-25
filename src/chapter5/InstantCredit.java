package chapter5;

import java.util.Scanner;

public class InstantCredit {

    //Variables known
    static int requireSalary = 25000;
    static int requireCredit = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //get what we do not known
        double salary = getSalary(); // aqui chama a funcao
        int creditScore = getCreditScore();
        scanner.close();

        //check if is qualify
        boolean qualified = isUserQualify(creditScore, salary);

        //Notify user
        notifyUser(qualified);
    }




    public static double getSalary(){
        System.out.println("Enter your salary: ");

        double salary = scanner.nextDouble();
        return salary;

    }

    public static int getCreditScore(){
        System.out.println("Enter your score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualify(int creditScore, double salary){
        if(creditScore >= requireCredit && salary >= requireSalary){
            return true;

        }
        else{
            return false;

        }

    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! you have been approved");
        }
        else{
            System.out.println("Sorry! you have been declined");
        }
    }
}

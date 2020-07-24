package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args){
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner (System.in);
        String grade = scanner.next();
        grade = grade.toUpperCase();
        scanner.close();
        String message;

        switch (grade){
            case "A":
                message = "Excellent Job";
                break;

            case "B":
                message = "Great Job!";
                break;

            case "C":
                message = "Good job";
                break;

            case "D":
                message = "You need to work hard!";
                break;
            default:
                message = "Error. Invalid type";
                break;
        }
        System.out.println("You type the letter: " + grade);
        System.out.println(message);

    }


}

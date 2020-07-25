package chapter6;

import java.util.Scanner;

public class homeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){

        homeAreaCalculatorRedo calculator = new homeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();


        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
        calculator.scanner.close();
    }

    public Rectangle getRoom(){

        System.out.println("lease enter the length size: ");
        double length = scanner.nextDouble();

        System.out.println("lease enter the width size: ");
        double width = scanner.nextDouble();



        return new Rectangle(length, width);
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateAre() + rectangle2.calculateAre();

    }
}

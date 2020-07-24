package charpter4;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args){

        // variables know
        int rate = 15;
        int maxHours = 40;
        int minimumHoursWorked = 1;


        //get input from unknown
        System.out.println("How many hours did you work?: ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();


        // validate input
        while(hoursWorked > maxHours || hoursWorked < minimumHoursWorked){
            System.out.println("Invalid entry. Your hours must be betwen 1 and 40. Try again");
            hoursWorked = scanner.nextDouble();

        }
        scanner.close();
        // calculate gross
        double grossPay = (rate * hoursWorked);
        System.out.println("Please check your salary: $" + grossPay);

    }
}

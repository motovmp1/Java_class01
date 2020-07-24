package charpter4;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Cashier {
    public static void main(String[] args){
        //Get number of items to scan
        System.out.println("Enter the number of items  would you like yo scan");
        Scanner scanner = new Scanner (System.in);
        int quantity = scanner.nextInt();


        double total =0;
        int items = quantity;

        // create a loop to iterate all
        for(int i =0; i<quantity; i++){

            items = items - i;
            System.out.println("Enter the cost of the item: ");
            System.out.println("Y0u choose : " + items + " Items");


            double price = scanner.nextDouble();

            total = total + price;
            //items = items - i;


        }

        scanner.close();
        System.out .println(" Ypu need to pay: " + total);
    }

}

package chapter6;

public class homeAreaCalculator {
    public static void main(String[] args){
        /*
        rectangle 1
         */
        // Create instance of rectangle class
        Rectangle room1 = new Rectangle(); // methods call
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateAre();

        /*
        rectangle 2
         */
        Rectangle room2 = new Rectangle(30, 75);
            double areaOfRoom2 = room2.calculateAre();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}

/*Encapsulation
        Achieve encapsulation using getters/setters for a class House that has the following instance variables:
        an int floorsNumber
        a string address
        an array of strings residentsNames
        use a tester class to:
        set the values by asking the user to input them
        for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
        prints the house details using the getters and String.format()*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        House house1 = new House();

        house1.setFloorNumbers(scanner.nextInt());
        scanner.nextLine();
        house1.setAddress(scanner.nextLine());

        String residents = scanner.nextLine();
        String[] residentNames = residents.split(",");
        house1.setResidentsNames(residentNames);

        String house1Details = String.format("House1Details: floors: %d, address: %s, residents: %s", house1.getFloorNumbers(),
                house1.getAddress(), Arrays.toString(house1.getResidentsNames()));

        System.out.println(house1Details);
    }
}



package lv.acodemy.pez;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //new Java object-class - scanner
        // Scanner class for "reading" input
        //System.in — the “standard” input stream:
        //Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your PEZ dispenser name (any name):");
        String pezName = scanner.nextLine();
        //the nextLine() method to read an entire line of input as a String and advance to the next line
        //If we’re expecting numeric inputs, we can use nextInt() and nextDouble()

        System.out.println("Please enter your PEZ dispenser model (for example: Batman):");
        String model = scanner.nextLine();

        System.out.println("Please enter your PEZ dispenser color:");
        String color = scanner.nextLine();

        PEZDispenser test = new PEZDispenser(pezName, model, color);
        System.out.println("You have created new PEZ dispenser: " + test + ".");

        while(true) {
            //This while loop uses the constant boolean value true as its condition,
            // which is always true, so the loop will never exit.
            System.out.println("Choose your next action:");
            System.out.println("1. Put one candy.\n" +
                    "2. Put several candies.\n" +
                    "3. Get one candy.\n" +
                    "4. Get several candies.\n" +
                    "5. Show current candy amount.\n" +
                    "6. Exit.");

            System.out.println("Please enter your next action number:");
            int input1 = scanner.nextInt();

            int candyAmount = 12;

            switch (input1) {
                case 1:
                    test.putOne();
                    //method from another class
                    //break redirects to menu
                    break;
                case 2:
                    System.out.println("How many candies do you want to put?");
                    System.out.println("Enter number:");
                    int input2 = scanner.nextInt();
                    test.putMore(input2);
                    break;
                case 3:
                    test.getOne();
                    break;
                case 4:
                    System.out.println("How many candies do you want to get?");
                    System.out.println("Enter number:");
                    int input3 = scanner.nextInt();
                    test.getMore(input3);
                    break;
                case 5:
                    test.starDisplay();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return; //end main method and returns the result, but since the method is void, it is empty

            }
        }
    }

}






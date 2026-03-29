//**
// Noah McCarthy Assignment 1.3 
// This program calculates the energy needed to heat a certain amount of water from an initial temperature to a final temperature.
// */

import java.util.Scanner; // Allows for user input

public class App {
    public static void main(String[] args) throws Exception {
        //Comments method 1
        /** 
         * Comments method 2
         *  */

        //declare variables
        double waterWeight = 0;
        double initialTemperature = 0;
        double finalTemperature = 0;
        boolean Loop = true;
        
        //Init Scanner
        Scanner Input = new Scanner(System.in);
        //Loop to allow for multiple calculations
        while (Loop == true) {
            System.out.println("Enter the amount of water in kg:");
            //If Check for valid input
            if (Input.hasNextDouble()) {
                 waterWeight = Input.nextDouble();

            }
            else {
                System.out.println("Invalid input. Please enter a number.");
                Input.next(); // Clear the invalid input
                continue;
            }
        
            System.out.println("What is the inital temperature of the water in Celsius:");
            //If Check for valid input
            if (Input.hasNextDouble()) {
                initialTemperature = Input.nextDouble();
            }
            else {
                System.out.println("Invalid input. Please enter a number.");
                Input.next(); // Clear the invalid input
                continue;
            }
        
            System.out.println("What is the final temperature of the water in Celsius:");
            //If Check for valid input
            if (Input.hasNextDouble()) {
                finalTemperature = Input.nextDouble();
            }
            else {
                System.out.println("Invalid input. Please enter a number.");
                Input.next(); // Clear the invalid input
                continue;
            }
        // Calculate energy and return result
            double Result = waterWeight * (finalTemperature - initialTemperature) * 4184;
            System.out.println("The energy needed to heat the water is: " + Result + " Joules");


            System.out.println("Do you want to calculate again? (yes/no)");
            //If check for valid input
            //use.equals to compare strings as == compares memory locations
            if (Input.next().equals("no")) {
                Loop = false;
            }
        }
        Input.close();
    }
}

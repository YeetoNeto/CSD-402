// Noah McCarthy CSD 402 Module 2.2 Assignment
// Rock, Paper, Scissors Game


import java.util.Scanner; // Allows for user input



public class App {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        boolean Loop = true;
         
       while(Loop == true) {
        //Generate Play for rock, paper, scissors
        int Play = (int)(Math.random() * 3) + 1; // Generates a random number between 1 and 3


        System.out.println("Let's play rock, paper, scissors! I already have my pick. What is your pick? 1 for rock, 2 for paper, and 3 for scissors.");

        if (Input.hasNextDouble()) {
            int userPlay =  Input.nextInt();

            //Calculate the play and determine the winner
            if (userPlay == Play) {
                System.out.println(userPlay +" vs "+ Play +" - It's a tie!");

                // Rock vs Scissors | Paper vs Rock | Scissors vs Paper
            } else if ((userPlay == 1 && Play == 3) || (userPlay == 2 && Play == 1) || (userPlay == 3 && Play == 2)) {
                System.out.println(userPlay +" vs "+ Play +" - You win!");

                // Rock vs Paper | Paper vs Scissors | Scissors vs Rock
            } else if ((userPlay == 1 && Play == 2) || (userPlay == 2 && Play == 3) || (userPlay == 3 && Play == 1)) {
                System.out.println(userPlay +" vs "+ Play +" - You lose!");

                // Error check for numbers outside of 1, 2, and 3
            } else {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                continue;
            }

            //Error check if something other than a number is entered
        } else {
            System.out.println("Invalid input. Please enter a number.");
            continue;
        }

        System.out.println("Do you want to play again? (yes/no)");
        //If check for valid input
            //use.equals to compare strings as == compares memory locations
        if (Input.next().equals("no")) {
            Loop = false;
            System.out.println("Thanks for playing!");
        }
       }
       Input.close();
        
    }
}




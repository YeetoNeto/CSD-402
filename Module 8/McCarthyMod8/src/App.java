/*
Noah McCarthy CSD 402 Module 8.2 Assignment
Use ArrayList and create a class that uses it
*/

//Imports
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        //Initialize variables
        Scanner Input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        boolean loop = true;

        while (loop) {
            System.out.println("Enter a number to add to the list, or 0 to stop:");
            int number = Input.nextInt();
            if (number == 0) { //loop stop condition
                loop = false;
            }
            list.add(number);
        }
        System.out.println("The maximum value in the list is: " + McCarthyArrayListTest.max(list)); //Accesses class method max that returns an int
    }
}

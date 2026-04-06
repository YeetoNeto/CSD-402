

// Noah McCarthy Assignment 3.2 CSD402
// Nested For Loops



public class App {
    public static void main(String[] args) throws Exception {

        int rows = 7;
        int append;
        String[] line = new String[rows]; // array to store the information so it can later be adjusted for alignment

        for (int i = 0; i+1 <= rows; i++) {
            line[i] = ""; // Initialize the line string for the current row

            // Append leading spaces
            //.repeat acts like a multipler for the string like in python so similar to " " * 7 in python
            //https://www.geeksforgeeks.org/java/string-class-repeat-method-in-java-with-examples/
            line[i] += " ".repeat((rows - i-1)*2);

            int num = 1;

            // Increasing part
            for (int j = 1; j <= i+1; j++) {
                line[i] += num + " ";
                num *= 2;
            }

            // Decreasing part
            num /= 4; // step back before reversing
            for (int j = 1; j < i+1; j++) {
                line[i] += num + " ";
                num /= 2;
            }
        }
    
        // Print all lines
        for (int i = 0; i < rows; i++) {
            //Calculate the spaces needed to be added to align in a nice column :)
            //Lowkey went crazy with trying to get the alignment right, but it was so satisfying to celebrate getting it right when I realized what I should try
            append = line[rows-1].length() - line[i].length();
            line[i] += " ".repeat(append);


            System.out.println(line[i] + "@");
        }
    }
}
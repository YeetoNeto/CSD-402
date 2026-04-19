/*
Noah McCarthy Assignment 5.2
Practice use of multi-dimensional arrays 
*/



public class App {
    
    public static int [ ] locateLargest (int [ ][ ] intArray){
        int maxRow = 0;
        int maxCol = 0;
        int maxVal = intArray[0][0]; // assign maxval to first in array to compare between the other numbers in array
        for (int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray[i].length; j++){
                if (intArray[i][j] > maxVal){
                    maxVal = intArray[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new int[]{maxRow, maxCol};
    }
    public static int [ ] locateLargest (double [ ][ ] doubleArray){
        int maxRow = 0;
        int maxCol = 0;
        double maxVal = doubleArray[0][0]; // assign maxval to first in array to compare between the other numbers in array
        for (int i = 0; i < doubleArray.length; i++){
            for (int j = 0; j < doubleArray[i].length; j++){
                if (doubleArray[i][j] > maxVal){
                    maxVal = doubleArray[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new int[]{maxRow, maxCol};
    }
    public static int [ ] locateSmallest (double [ ][ ] doubleArray){
        int minRow = 0;
        int minCol = 0;
        double minVal = doubleArray[0][0]; // assign minval to first in array to compare between the other numbers in array
        for (int i = 0; i < doubleArray.length; i++){
            for (int j = 0; j < doubleArray[i].length; j++){
                if (doubleArray[i][j] < minVal){
                    minVal = doubleArray[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        return new int[]{minRow, minCol};
    }
    public static int [ ] locateSmallest (int [ ][ ] intArray){
        int minRow = 0;
        int minCol = 0;
        int minVal = intArray[0][0]; // assign minval to first in array to compare between the other numbers in array
        for (int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray[i].length; j++){
                if (intArray[i][j] < minVal){
                    minVal = intArray[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        return new int[]{minRow, minCol};
    }



    public static void main(String[] args) throws Exception {
        int[][] intMultiArray = {{3,65},{1,4},{5,6}};
        double[][] doubleMultiArray = {{1,2},{50000,9},{5,0}};
        int[] Location = new int[2];


        System.out.println("Int Array:" );
        for (int i = 0; i < intMultiArray.length; i++){
            for (int j = 0; j < intMultiArray[i].length; j++){
                System.out.print(intMultiArray[i][j]);
                if( (j+1) != intMultiArray[i].length){
                    System.out.print(",");
                }
            }
            System.out.print("\n");
        }

        System.out.println("\nDouble Array:"); 

        for (int i = 0; i < doubleMultiArray.length; i++){
            for (int j = 0; j < doubleMultiArray[i].length; j++){
                System.out.print(doubleMultiArray[i][j]);
                if( (j+1) != doubleMultiArray[i].length){
                    System.out.print(",");
                }
            }
            System.out.print("\n");
        }


        //Assign array returns to a one dimensional array to display the coordinates of the method return for each Largest and Smallest and array type.
        Location = locateLargest(intMultiArray);
        System.out.println("\nThe location of Largest in the int array is (" + Location[0] + "," + Location[1] + ")");


        Location = locateLargest(doubleMultiArray);
        System.out.println("\nThe location of Largest in the double array is (" + Location[0] + "," + Location[1] + ")");


        Location = locateSmallest(intMultiArray);
        System.out.println("\nThe location of Smallest in the int array is (" + Location[0] + "," + Location[1] + ")");


        Location = locateSmallest(doubleMultiArray);
        System.out.println("\nThe location of Smallest in the double array is (" + Location[0] + "," + Location[1] + ")");
    }

}

/*
Noah McCarthy CS402 Assignment 4.2
Create four overlaoded functions and feed them arrays of different data types. Print arrays and return average of said arrays.
*/



public class App {

   
   
   //Overloaded Average methods
    public static short average (short[] array){
        short sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    //needed to convert the result to short ohterwise it will convert to int after arithmetic
    return (short)(sum / array.length);
    
    }



    public static int average (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    return (sum / array.length);
    
    }



    public static long average (long[] array){
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }


    
    public static double average (double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length; 
    }




    public static void main(String[] args) throws Exception {
        // Array initialization
        short[] shortArray = {1, 2, 3, 4, 5};
        int[] intArray = {100000, 200000, 300000 };
        long[] longArray = {145435345L, 2345345345L, 4546546546L, 10000L};
        double[] doubleArray = {1.4, 2.8, 3.5, 4.5, 5.1, 6.7};


        //Print Topic
        System.out.println("Elements of the arrays and their averages:");


        //Short Array call
        System.out.println("\nShort Array:");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print("[" + shortArray[i] + "]" + " ");
        }
        System.out.println("\nAverage of Short Array:\n" + average(shortArray));



        //Int Array call
        System.out.println("\nInt Array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("[" + intArray[i] + "]" + " ");
        }
        System.out.println("\nAverage of Int Array:\n" + average(intArray));



        //Long Array call
        System.out.println("\nLong Array:");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print("[" +longArray[i] + "]" + " ");
        }
        System.out.println("\nAverage of Long Array:\n" + average(longArray));


        //Double Array call
        System.out.println("\nDouble Array:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print("[" + doubleArray[i] + "]" + " ");
        }
        System.out.println("\nAverage of Double Array:\n" + average(doubleArray));

    }
}


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]){

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);

        sortArray(myIntegers);
        printArray(myIntegers);

    }//end of main method

    public static int[] getIntegers(int number){
        System.out.println(" Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i =0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;

    }//end of getIntegers method

    public static void printArray(int[] array){

        for(int i = 0 ; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }

    }//end of printArray

    public static int[] sortArray(int[] descending){
        System.out.println(" Descending array... ");
        int[] sortedArray = Arrays.copyOf(descending, descending.length);

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {

                if (sortedArray[i] < sortedArray[j]) {

                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }

            }

        }

        return sortedArray;
    }

}//end of Main class

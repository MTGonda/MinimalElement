import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
minValue(readIntegers());
    }
    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        String [] scannerInputs = scanner.next().split(",");
        int [] putTheNumber = new int[scannerInputs.length];
        int iterator = 0;
        while(iterator<scannerInputs.length-1){
        for(String numbers : scannerInputs){

            putTheNumber[iterator] =Integer.parseInt(numbers);
            System.out.println(Arrays.toString(putTheNumber));
            iterator++;
        }}
        return putTheNumber;
    }
private static int minValue (int[] array){
        int [] copyArray = Arrays.copyOf(array,array.length);
    Arrays.sort(copyArray);
    System.out.println(copyArray[0]);
    return copyArray[0];
    }
}
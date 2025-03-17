//1. Modify the program to accept user input for an array.
import java.util.Scanner;

public class selfPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numOfElements = scanner.nextInt();

        int[] array = new int[numOfElements];
        System.out.println("Enter " + numOfElements + " elements:");
        for (int i = 0; i < numOfElements; i++) {
            array[i] = scanner.nextInt();
        }
        bubbleSort(array);

        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
    public static void bubbleSort(int[] array) {
        int numOfElements = array.length;
        for (int i = 0; i < numOfElements - 1; i++) {
            for (int j = 0; j < numOfElements - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tempo = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempo;
                }
            }
        }
    }
}

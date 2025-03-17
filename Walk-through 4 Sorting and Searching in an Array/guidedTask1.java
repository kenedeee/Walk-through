//1. Modify the program to implement Selection Sort.
public class guidedTask1{
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
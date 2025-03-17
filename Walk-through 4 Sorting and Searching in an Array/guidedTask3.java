//3. Convert the Linear Search into a Binary Search.
import java.util.Arrays; // Import for sorting

public class guidedTask3 {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};
        int target = 2;

        Arrays.sort(array);

        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (array[mid] == target) {
                return mid; 
            }
            if (array[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1;
    }
}
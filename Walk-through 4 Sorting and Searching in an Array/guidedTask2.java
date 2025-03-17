//2. Implement a Linear Search to find an element in an array. 
public class guidedTask2 {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};
        int target = 2;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
//2. Implement insertion sort on an array of strings. 
public class selfPractice2 {
    public static void main(String[] args) {
        String[] array = {"Banana", "Apple", "Cherry", "Mango", "Lemon"};

        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.print("Sorted Array: ");
        for (String string : array) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
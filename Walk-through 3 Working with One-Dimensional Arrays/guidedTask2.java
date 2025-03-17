//2. Find the maximum and minimum value in an array. 
public class guidedTask2{
    public static void main(String[] args){
        int[] numbers = {5, 2, 3, 1, 4};
        int min = numbers[0];
        int max = numbers[0];

        for(int num : numbers){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        System.out.println("Array Elements: ");
        for(int num : numbers){
            System.out.println(num + " ");
        }
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}
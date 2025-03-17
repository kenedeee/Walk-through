import java.util.*;

public class selfPractice1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your fullname: ");
        String fullName = scanner.nextLine();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + fullName + "!");
        System.out.println(age);
    }
}

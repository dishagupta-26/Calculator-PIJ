import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\nSelect an Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Sum of Array");
        System.out.println("7. Mean of Array");
        System.out.println("8. Variance of Array");
        System.out.println("9. Standard Deviation of Array");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public int getChoice() {
        return scanner.nextInt();
    }

    public int[] getTwoNumbers() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        return new int[] { num1, num2 };
    }

    public int getSingleNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public int[] getArrayInput() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

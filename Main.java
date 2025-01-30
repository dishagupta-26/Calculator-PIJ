// Name: Disha Deepak Gupta
// PRN: 24070126513
// Batch: A2

public class Main {
    public static void main(String[] args) {
        UserInput inputHandler = new UserInput();
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator Program!");
        int choice;

        do {
            inputHandler.displayMenu();
            choice = inputHandler.getChoice();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(inputHandler.getTwoNumbers()));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(inputHandler.getTwoNumbers()));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(inputHandler.getTwoNumbers()));
                    break;
                case 4:
                    System.out.println("Result: " + calculator.divide(inputHandler.getTwoNumbers()));
                    break;
                case 5:
                    System.out.println(
                            "Fibonacci Sequence: " + calculator.generateFibonacci(inputHandler.getSingleNumber()));
                    break;
                case 6:
                    int[] array = inputHandler.getArrayInput();
                    System.out.println("Sum of Array: " + calculator.sumOfArray(array));
                    break;
                case 7:
                    array = inputHandler.getArrayInput();
                    System.out.println("Mean of Array: " + calculator.meanOfArray(array));
                    break;
                case 8:
                    array = inputHandler.getArrayInput();
                    System.out.println("Variance of Array: " + calculator.varianceOfArray(array));
                    break;
                case 9:
                    array = inputHandler.getArrayInput();
                    System.out.println("Standard Deviation of Array: " + calculator.standardDeviationOfArray(array));
                    break;
                case 0:
                    System.out.println("Exiting Program. Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        } while (choice != 0);
    }
}

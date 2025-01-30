import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // adding 2 numbers
    public int add(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    // subtracting second number from the first
    public int subtract(int[] numbers) {
        return numbers[0] - numbers[1];
    }

    // multiplying the 2 numbers
    public int multiply(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    // dividing the first number by the second
    public double divide(int[] numbers) {
        if (numbers[1] == 0) {
            // throwing an exception if the second number is 0
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) numbers[0] / numbers[1];
    }

    // generating fibonacci sequence of n numbers
    public List<Integer> generateFibonacci(int n) {
        List<Integer> fibonacci = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            fibonacci.add(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        return fibonacci;
    }

    // calculating sum of array elements
    public int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // calculating mean of array elements
    public double meanOfArray(int[] array) {
        return (double) sumOfArray(array) / array.length;
    }

    // calulating variance of array elements
    public double varianceOfArray(int[] array) {
        double mean = meanOfArray(array);
        double variance = 0;
        for (int num : array) {
            variance += Math.pow(num - mean, 2);
        }
        return variance / array.length;
    }

    // calculating standard deviation of array elements
    public double standardDeviationOfArray(int[] array) {
        return Math.sqrt(varianceOfArray(array));
    }
}

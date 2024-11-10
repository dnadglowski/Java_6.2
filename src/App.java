public class App {
    public static void main(String[] args) throws Exception {
        // Example usage of sumDigits method
        int result = SumDigitsExample.sumDigits(234); // Example input
        System.out.println("Sum of digits: " + result);
    }

    static class SumDigitsExample {
        public static int sumDigits(int number) {
            int sum = 0;

            while (number > 0) {
                sum += number % 10; // Extract the last digit and add to sum
                number /= 10;       // Remove the last digit
            }

            return sum;
        }
    }
}
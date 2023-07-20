import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter an operation (+, -, *, /) or 'q' to quit:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            if (!isValidOperator(input)) {
                System.out.println("Invalid operator! Please enter a valid operation (+, -, *, /) or 'q' to quit.");
                continue;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character left by nextDouble()

            double result = performOperation(input.charAt(0), num1, num2);
            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static boolean isValidOperator(String operator) {
        return operator.matches("[+\\-*/]");
    }

    private static double performOperation(char operator, double num1, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    return Double.NaN;
                }
            default:
                return 0.0;
        }
    }
}
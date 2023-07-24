import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.runCalculator();
    }

    public void runCalculator() {
        System.out.println("------------------------------------ \n    Welcome to Simple Calculator \n------------------------------------");
        System.out.println("Following operations are supported :");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit (enter 'q' at any time) \n");

        while (true) {
            String num1Str = readInput("Enter the first number: ");
            if (num1Str.equalsIgnoreCase("q")) {
                break;
            }

            double num1 = parseInputToDouble(num1Str);
            if (Double.isNaN(num1)) {
                System.out.println("Invalid input for the first number. Please enter a valid number.");
                continue;
            }

            String operator = readOperator();
            if (operator.equalsIgnoreCase("q")) {
                break;
            }

            String num2Str = readInput("Enter the second number: ");
            if (num2Str.equalsIgnoreCase("q")) {
                break;
            }

            double num2 = parseInputToDouble(num2Str);
            if (Double.isNaN(num2)) {
                System.out.println("Invalid input for the second number. Please enter a valid number.");
                continue;
            }

            double result = performOperation(num1, num2, operator);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        }
        System.out.println("Calculator has been closed. Goodbye!");
    }

    private String readInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String readOperator() {
        String operator;
        while (true) {
            operator = readInput("Enter an operator (+, -, *, /): ");
            if (operator.matches("[+\\-*/]")) {
                return operator;
            } else if (operator.equalsIgnoreCase("q")) {
                return operator;
            } else {
                System.out.println("Invalid operator. Please try again.");
            }
        }
    }

    private double parseInputToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }

    double performOperation(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }
                return num1 / num2;
            default:
                System.out.println("Invalid operator. Please try again.");
                return Double.NaN;
        }
    }
}

import java.util.Scanner;

    public class SimpleCalculator {

        private static boolean isValidOperation (char operation) {
            if (operation == 'q' || operation == 'Q') System. exit(0);
            return (operation == '+' || operation == '-' || operation == '*' || operation == 'x' || operation == '/');
        }

        public static void main(String[] args) {
            char operation;

            System.out.println("------------------------------------ \n" + "\tWelcome to Simple Calculator \n" + "------------------------------------");

            System.out.println("Following operations are supported :");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (* OR x)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit (q)\n");

            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Enter an operator: (+ OR - OR * OR / OR Q for Exit) ");

                while (true) {
                    operation = scanner.next().charAt(0);
                    if (isValidOperation(operation)) break;
                    System.err.println("Invalid Operator. Please use only + or - or * or /");
                }

                System.out.println("Enter First Number: ");
                double num1 = scanner.nextDouble();

                System.out.println("Enter Second Number: ");
                double num2 = scanner.nextDouble();

                if (operation == '/' && num2 == 0.0) {
                    System.err.println("Second Number can't be zero for Division operation.");
                }

                if (operation == '+') {
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                } else if (operation == '-') {
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (operation == '*' || operation == 'x') {
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                } else if (operation == '/') {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }

            } while (true);
        }
    }

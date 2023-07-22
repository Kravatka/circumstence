import java.util.Scanner;

public class SimpleCalculator {
    public SimpleCalculator() {
    }

    private static boolean isValidOperation(char var0) {
        if (var0 == 'q' || var0 == 'Q') {
            System.exit(0);
        }

        return var0 == '+' || var0 == '-' || var0 == '*' || var0 == 'x' || var0 == '/';
    }

    public static void main(String[] var0) {
        System.out.println("------------------------------------ \n\tWelcome to Simple Calculator \n------------------------------------");
        System.out.println("Following operations are supported :");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (* OR x)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit (q)\n");
        Scanner var2 = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println("Enter an operator: (+ OR - OR * OR / OR Q for Exit) ");

                while(true) {
                    char var1 = var2.next().charAt(0);
                    if (isValidOperation(var1)) {
                        System.out.println("Enter First Number: ");
                        double var3 = var2.nextDouble();
                        System.out.println("Enter Second Number: ");
                        double var5 = var2.nextDouble();
                        if (var1 == '/' && var5 == 0.0) {
                            System.err.println("Second Number can't be zero for Division operation.");
                        }

                        if (var1 == '+') {
                            System.out.println("" + var3 + " + " + var5 + " = " + (var3 + var5));
                            break;
                        }

                        if (var1 == '-') {
                            System.out.println("" + var3 + " - " + var5 + " = " + (var3 - var5));
                        } else if (var1 != '*' && var1 != 'x') {
                            if (var1 == '/') {
                                System.out.println("" + var3 + " / " + var5 + " = " + var3 / var5);
                            }
                        } else {
                            System.out.println("" + var3 + " x " + var5 + " = " + var3 * var5);
                        }
                        break;
                    }

                    System.err.println("Invalid Operator. Please use only + or - or * or /");
                }
            }
        }
    }
}

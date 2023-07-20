# SimpleCalculator

The SimpleCalculator is a basic Java calculator program that allows you to perform simple arithmetic operations. This calculator is run through the command line interface (CLI) and can handle addition, subtraction, multiplication, and division operations.

## How to Use

1. Clone the repository or download the `SimpleCalculator.java` file.

2. Open a terminal or command prompt in the directory where the `SimpleCalculator.java` file is located.

3. Compile the Java code using the `javac` command:

   ```
   javac SimpleCalculator.java
   ```

4. After successful compilation, you will find a file named `SimpleCalculator.class` in the same directory.

5. Create a JAR file using the `jar` command:

   ```
   jar cvfe SimpleCalculator.jar SimpleCalculator SimpleCalculator.class
   ```

6. Now, you will have a JAR file named `SimpleCalculator.jar` in your directory.

7. To run the calculator, use the following command:

   ```
   java -jar SimpleCalculator.jar
   ```

8. The calculator program will start running in the console. You will be prompted to enter an operation and two numbers to perform the calculation.

9. Enter the operation you want to perform ('+', '-', '*', or '/'), and then input the two numbers you want to calculate with.

10. The program will display the result of the calculation.

11. To quit the calculator, type 'q' when prompted to enter an operation.

## Example Usage

```
$ java -jar SimpleCalculator.jar
Simple Calculator
Enter an operation (+, -, *, /) or 'q' to quit:
+
Enter the first number: 10
Enter the second number: 5
Result: 15.0

Enter an operation (+, -, *, /) or 'q' to quit:
/
Enter the first number: 20
Enter the second number: 0
Cannot divide by zero!

Enter an operation (+, -, *, /) or 'q' to quit:
q
Exiting the calculator. Goodbye!
```

## Note

This is a basic example of a calculator program and may not handle all edge cases or complex calculations. It is meant for educational purposes and can be extended or modified as needed.
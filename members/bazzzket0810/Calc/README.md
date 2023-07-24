# SimpleCalculator

The SimpleCalculator is a basic Java program which allows you to perform simple arithmetic operations. 
This calculator is run through the command line interface (CLI).

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
   jar -cvfe SimpleCalculator.jar SimpleCalculator SimpleCalculator.class
   ```

6. Now, you will have a JAR file named `SimpleCalculator.jar` in your directory.

7. To run the calculator, use the following command:

   ```
   java -jar SimpleCalculator.jar
   ```

8. The calculator program will start running in the console. You will be prompted to enter two numbers and an operation to perform the calculation.

9. Input the first number, operation and the second number you want to calculate with.

10. The program will display the result of the calculation.

11. To quit the calculator, type 'q' at any time.

## Example Usage

```
------------------------------------ 
    Welcome to Simple Calculator 
------------------------------------
Following operations are supported :
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit (enter "q" at any time) 

Enter the first number: 12
Enter an operator (+, -, *, /): +
Enter the second number: 5
Result: 17.0
Enter the first number: 5
Enter an operator (+, -, *, /): /
Enter the second number: 0
Error: Division by zero is not allowed.
Enter the first number: 6
Enter an operator (+, -, *, /): +
Enter the second number: sfds
Invalid input for the second number. Please enter a valid number.
Enter the first number: q
Calculator has been closed. Goodbye!

```

## Note

This is a basic example of a calculator program and may not handle all edge cases or complex calculations. It is meant for educational purposes and can be extended or modified as needed.

Enjoy!
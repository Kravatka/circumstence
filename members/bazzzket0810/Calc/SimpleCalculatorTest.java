import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void testAddition() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.performOperation(5, 3, "+");
        assertEquals(8.0, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.performOperation(5, 3, "-");
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.performOperation(5, 3, "*");
        assertEquals(15.0, result, 0.001);
    }

    @Test
    public void testDivision() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.performOperation(10, 2, "/");
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.performOperation(5, 0, "/");
        assertEquals(Double.NaN, result, 0.001);
    }

    @Test
    public void testInvalidOperands() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.performOperation(Double.NaN, 3, "+");
        assertEquals(Double.NaN, result, 0.001);
    }

    @Test
    public void testInputNaNAsOperands() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.performOperation(5, Double.NaN, "+");
        assertEquals(Double.NaN, result, 0.001);
    }
}

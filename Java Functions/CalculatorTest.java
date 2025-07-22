import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testThatCalculatorAddTwoNumbers(){
        int result = calc.add(10, 1);
        assertEquals(11, result);
    }

    @Test
    public void testThatCalculatorDivideTwoNumbers(){
        int expectedResult = calc.divide(10, 5);
        assertEquals(2, expectedResult);
    }

    @Test
    public void testThatANumberIsDividedByZero(){
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest {
    CalculatorMethods calculatorMethods;

    @BeforeEach
    void setUp() {
        calculatorMethods = new CalculatorMethods();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply () {
        assertEquals(24.75, calculatorMethods.multiplication(4.5,5.5), "multiplication should work");
    }

    @Test
    @DisplayName("Simple subtraction should work")
    public void testSubtraction () {
        assertEquals(2, calculatorMethods.subtract(4.2,2.2), "subtraction should work");
    }
}

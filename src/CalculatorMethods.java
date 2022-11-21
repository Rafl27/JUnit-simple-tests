import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorMethods {

    public CalculatorMethods() {
    }

    public static Double multiplication (Double x, Double y) {
        return x * y;
    }

    public static Double add(Double x, Double y) {
        return x + y;
    }

    public static Double divide (Double x, Double y) {
        return x / y;
    }

    public static Double subtract (Double x, Double y) {
        return x - y;
    }


//    @Test
//    @DisplayName("Simple multiplication should work")
//    public void testMultiply () {
//        assertEquals(25.75, multiplication(4.5,5.5), "multiplication should work");
//    }
}

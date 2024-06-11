package Yaatou.atelier_JUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @Test
    void testAdd() {
    assertEquals(5, calculator.add(2, 3), "2 + 3 doit être égal à 5");

    }
    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3,
                2));}
}

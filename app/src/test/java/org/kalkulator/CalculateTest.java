package org.kalkulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculateTest {

    // TC01 & TC06
    @Test
    public void testAddition() {
        assertEquals(10, Calculate.calculate('1', 8, 2), 0.0001, "Addition test failed");
    }

    // TC02 & TC07
    @Test
    public void testSubtraction() {
        assertEquals(1, Calculate.calculate('2', 10, 9), 0.0001, "Subtraction test failed");
    }

    // TC03 & TC08
    @Test
    public void testMultiplication() {
        assertEquals(20, Calculate.calculate('3', 10, 2), 0.0001, "Operator Multiplication test failed");
    }

    // TC04 & TC09
    @Test
    public void testDivision() {
        assertEquals(4, Calculate.calculate('4', 20, 5), 0.0001, "Division test failed");
    }

    // TC05
    @Test
    public void testOutOperator() {
        assertEquals(Double.NaN, Calculate.calculate('5', 3, 5), 0.0001, "Operator Valid");
    }

    @Test
    void testCalculate() {
        
    }

}

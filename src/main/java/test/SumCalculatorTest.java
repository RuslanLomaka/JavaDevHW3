package test;

import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    public void testThatSumWorksCorrect1() {
        int expected = 1;
        int actual = calc.sum(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrect2() {
        int expected = 3;
        int actual = calc.sum(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrect3() {
        int expected = 6;
        int actual = calc.sum(3);
        Assertions.assertEquals(expected, actual);
    }


}

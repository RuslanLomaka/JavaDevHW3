import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 3",
            "3, 6"
    })
    void shouldReturnCorrectSumWhenInputIsPositive(int input, int expected) {
        int actual = calc.sum(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldThrowExceptionWhenInputIsZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }
    /*
    No need to have @AfterEach action because there are no open resources in this particular case
    */
}
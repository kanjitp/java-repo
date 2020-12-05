import org.junit.Test;
import org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }
}

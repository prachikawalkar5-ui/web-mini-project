package calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTwoNumberTest {
	addtwonumber calc = new addtwonumber();

    @Test
    void testAdd() {
        int result = calc.add(10,20,30,9);
        assertEquals(69, result);
    }

    @Test
    void testSubtract() {
        int result = calc.subtract(20,30);
        assertEquals(-10, result);
    }

    @Test
    void testMultiply() {
        int result = calc.multiply(10,20);
        assertEquals(200, result);
    }
}

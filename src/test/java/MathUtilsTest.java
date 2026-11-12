import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @Test
    void testMax() {
        assertEquals(10, MathUtils.max(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(5, MathUtils.divide(10, 2));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(10, 0));
    }
}
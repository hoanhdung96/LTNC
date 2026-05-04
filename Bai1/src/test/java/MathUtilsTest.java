import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void testAdd() {
        MathUtils utils = new MathUtils();
        assertEquals(10, utils.add(2, 3), "2 + 3 phải bằng 5");
    }
}
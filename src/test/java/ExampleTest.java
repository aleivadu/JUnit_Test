import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    int a = 1;
    int b = -5;
    int c = 0;
    Example ex = new Example();

    @Test
    void isPositive() {
        assertEquals(1,ex.isPositive(a));
        assertEquals(0, ex.isPositive(b));
        assertEquals(-1,ex.isPositive(c));
    }
}
import MathematicsProgression.LinearProgression;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressionsTest {
    @Test
    void linearTestCaseConstructor() {
        LinearProgression p = new LinearProgression();
        long firstExpected = 0L;
        long currentExpected = 0L;

        assertEquals(firstExpected, p.getFirstValue());
        assertEquals(currentExpected, p.getCurrentValue());
    }
}

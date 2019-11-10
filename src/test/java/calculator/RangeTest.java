package calculator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {

    @Test
    public void isInRange() {
    Range range = new Range(10l, 30l);
    assertTrue(range.isInRange(15));

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrownIllegalArgumentExceptionOnWrongParameters() {
        new Range(20l, 10l);
    }
}
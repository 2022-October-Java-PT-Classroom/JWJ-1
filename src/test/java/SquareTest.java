import org.example.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquareTest {
    Square underTest = new Square(2);

    @Test
    public void shouldReturnTrueIfWidthEqualsLength() {
        Square square = new Square(2);
        boolean result = square.isSquare();
        assertTrue(result);
    }
}

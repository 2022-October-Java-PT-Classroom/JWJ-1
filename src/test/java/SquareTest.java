import org.example.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquareTest {
    Square underTest = new Square(2);

    @Test
    public void shouldReturnTrueIfWidthEqualsLength() {
        Square square = new Square(2);
        boolean result = square.isSquare();
        assertTrue(result);
    }
    @Test
    public void shouldReturnAreaOfSquare() {
        Square square = new Square(2);
        double result = square.getArea();
        assertEquals(4, result);
    }

    @Test
    public void shouldReturnPerimeterOfSquare() {
        Square square = new Square(2);
        double result = square.getPerimeter();
        assertEquals(8, result);
    }
}

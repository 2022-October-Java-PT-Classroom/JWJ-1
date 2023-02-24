import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    Rectangle underTest = new Rectangle(3, 4);

    @Test
    public void shouldCalculateAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(4, 6);
        double area = rectangle.getArea();
        assertEquals(12, area);
    }
    @Test
    public void shouldGetPerimeterOfRectangle(){
        Rectangle rectangle = new Rectangle(3, 4);
        double perimeter = rectangle.getPerimeter();
        assertEquals(14, perimeter);
    }
    @Test
    public void shouldReturnTrueIfWidthAndLengthPositive() {
        Rectangle rectangle = new Rectangle(3, 4);
        boolean result = rectangle.isRectangle();
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfWidthOrLengthNegative() {
        Rectangle rectangle = new Rectangle(-3, -4);
        boolean result = rectangle.isRectangle();
        assertFalse(result);
    }

    @Test
    public void shouldReturnAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(3, 4);
        double result = rectangle.getArea();
        assertEquals(12, result);
    }

    @Test
    public void shouldReturnPerimeterOfRectangle() {
        Rectangle rectangle = new Rectangle(3, 4);
        double result = rectangle.getPerimeter();
        assertEquals(14, result);
    }
}

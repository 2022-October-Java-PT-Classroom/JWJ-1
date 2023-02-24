import org.example.EquilateralTriangle;
import org.example.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {
    public void shouldGetSide1() {
        Triangle triangle = new EquilateralTriangle(5);
        assertEquals(5, triangle.getSide1());
    }

    @Test
    public void shouldGetSide2() {
        Triangle triangle = new EquilateralTriangle(5);
        assertEquals(5, triangle.getSide2());
    }

    @Test
    public void shouldGetSide3() {
        Triangle triangle = new EquilateralTriangle(5);
        assertEquals(5, triangle.getSide3());
    }

    @Test
    public void shouldReturnTrueForIsTriangle() {
        Triangle triangle = new EquilateralTriangle(5);
        assertTrue(triangle.isTriangle());
    }

}

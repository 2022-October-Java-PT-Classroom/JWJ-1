import org.example.IsoscelesTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsoscelesTriangleTest {
    IsoscelesTriangle underTest = new IsoscelesTriangle(2, 2);
    @Test
    public void shouldGetAreaOfIsoscelesTriangle() {
        IsoscelesTriangle triangle = new IsoscelesTriangle(2, 2);
        double area = underTest.getArea();
        assertEquals(4, triangle.getArea());
    }

    @Test
    public void shouldGetPerimeterOfIsoscelesTriangle() {
        IsoscelesTriangle triangle = new IsoscelesTriangle(2, 4);
        double area = underTest.getPerimeter();
        assertEquals(7, triangle.getPerimeter());
    }

    @Test
    public void shouldReturnFalseForEquilateral() {
        IsoscelesTriangle triangle = new IsoscelesTriangle(2, 4);
        assertFalse(triangle.isEquilateral());
    }

    @Test
    public void shouldReturnTrueForIsosceles() {
        IsoscelesTriangle triangle = new IsoscelesTriangle(2, 4);
        assertTrue(triangle.isIsosceles());
    }
}

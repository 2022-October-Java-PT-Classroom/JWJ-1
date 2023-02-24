import org.example.EquilateralTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquilateralTest {
    EquilateralTriangle underTest = new EquilateralTriangle(2);

    @Test
    public void shouldGetAreaOfEquilateralTriangle() {
        EquilateralTriangle triangle = new EquilateralTriangle(3);
        double area = underTest.getArea();
        assertEquals(Math.sqrt(3) * 4.5, area);
    }

    @Test
    public void shouldGetPerimeterOfEquilateralTriangle() {
        EquilateralTriangle triangle = new EquilateralTriangle(2);
        double perimeter = underTest.getPerimeter();
        assertEquals(9, perimeter);
    }

}

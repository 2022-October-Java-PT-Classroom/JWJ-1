import org.example.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTest {

    Circle underTest = new Circle(2);

    @Test
    public void shouldGetRadiusOfCircle(){
        double radius = underTest.getRadius();
        assertEquals(1,radius);
    }
    @Test
    public void shouldGetAreaOfCircle(){
        Circle circle = new Circle(2);
        double area = circle.getArea();
        assertEquals(Math.PI * 4, area);
    }

    @Test
    public void shouldReturnPerimeterOfCircle() {
        Circle circle = new Circle(2);
        double result = circle.getPerimeter();
        assertEquals(2 * Math.PI * 2, result);
    }

    @Test
    public void shouldReturnTrueIfRadiusIsPositive() {
        Circle circle = new Circle(2.0);
        boolean result = circle.isCircle();
        assertTrue(result);
    }
}

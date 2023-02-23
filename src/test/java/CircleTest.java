import org.example.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTest {

    Circle underTest = new Circle(1);

    @Test
    public void shouldGetRadiusOfCircle(){
        double radius = underTest.getRadius();
        assertEquals(1,radius);
    }
    @Test
    public void shouldGetAreaOfCircle(){
        double area = underTest.getArea();
        assertEquals(2,area);
    }
    @Test
    public void shouldGetPerimeterOfCircle(){
        double perimeter = underTest.getPerimeter();
        assertEquals(3, perimeter);
    }
    @Test
    public void shouldReturnTrueIfRadiusIsPositive() {
        Circle circle = new Circle(2.0);
        boolean result = circle.isCircle();
        assertTrue(result);
    }
}

import org.example.Circle;
import org.example.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShapeTest {
    Circle underTest = new Circle(1,2,3);

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

}
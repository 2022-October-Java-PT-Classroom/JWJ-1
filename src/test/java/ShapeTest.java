import org.example.Circle;
import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ShapeTest {
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
    public void shouldGetDiagonalOfRectangle(){
        Rectangle rectangle = new Rectangle(3, 4);
        double diagonal = rectangle.getDiagonal();
        assertEquals(5, diagonal);
    }
    @Test
    public void shouldReturnTrueIfWidthIsNotEqualToLength() {
        Rectangle rectangle = new Rectangle(4, 5);
        boolean result = rectangle.isRectangle();
        assertTrue(result);
    }



}
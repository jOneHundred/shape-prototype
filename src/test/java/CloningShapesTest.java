import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class CloningShapesTest {
    @Test
    void cloneCircleTest(){
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(5);
        Circle circleCopy = (Circle) circle.clone();
        assertEquals(circle, circleCopy);
        assertNotSame(circle, circleCopy);
    }

    @Test
    void cloneRectangleTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.setX(5);
        rectangle.setY(6);
        rectangle.setWidth(7);
        rectangle.setHeight(8);
        Rectangle rectangleCopy = (Rectangle) rectangle.clone();
        assertEquals(rectangle, rectangleCopy);
        assertNotSame(rectangle, rectangleCopy);
    }

    @Test
    void cloneTriangleTest(){
        EquilateralTriangle triangle = new EquilateralTriangle();
        triangle.setX(-10);
        triangle.setY(100);
        triangle.setSide(90);
        EquilateralTriangle triangleCopy = (EquilateralTriangle) triangle.clone();
        assertEquals(triangle, triangleCopy);
        assertNotSame(triangle, triangleCopy);
    }
}

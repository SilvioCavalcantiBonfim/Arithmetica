package test;

import org.junit.jupiter.api.Test;

import geometry.Plane;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {

    private static double approx = 0.001;

    @Test
    public void testPerimeterSquare() {
        assertEquals(8.0, Plane.RECTANGLE.perimeter(2.0, 2.0, 2.0, 2.0), approx);
    }

    @Test
    public void testPerimeterRectangle() {
        assertEquals(10.0, Plane.RECTANGLE.perimeter(2.0, 3.0, 2.0, 3.0), approx);
    }

    @Test
    public void testAreaSquare() {
        assertEquals(4.0, Plane.RECTANGLE.area(2.0, 2.0, 2.0, 2.0), approx);
    }

    @Test
    public void testAreaRectangle() {
        assertEquals(6.0, Plane.RECTANGLE.area(2.0, 3.0, 2.0, 3.0), approx);
    }

    @Test
    void testPerimeterForInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.perimeter(1, 2, 3, 2));
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.perimeter(1, 2, 1, 3));
    }

    @Test
    void testPerimeterForNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.perimeter(-1, 1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.perimeter(1, -1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.perimeter(1, 1, -1, 1));
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.perimeter(1, 1, 1, -1));
    }

    @Test
    void testAreaForInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.area(1, 2, 3, 2));
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.area(1, 2, 1, 3));
    }

    @Test
    void testAreaForNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.area(-1, 1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.area(1, -1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.area(1, 1, -1, 1));
        assertThrows(IllegalArgumentException.class, () -> Plane.RECTANGLE.area(1, 1, 1, -1));
    }
}

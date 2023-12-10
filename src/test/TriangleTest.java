package test;

import org.junit.jupiter.api.Test;

import geometry.Plane;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TriangleTest {

    private static double approx = 0.001;

    @Test
    void testPerimeterIsTriangle() {
        
        assertEquals(3, Plane.TRIANGLE.perimeter(1, 1, 1));
    }

    @Test
    void testAreaIsTriangleEquilateral() {
        assertEquals(Math.sqrt(3) / 4, Plane.TRIANGLE.area(1, 1, 1), approx);
    }

    @Test
    void testAreaIsTriangleIsosceles() {
        assertEquals(2.0, Plane.TRIANGLE.area(Math.sqrt(5), Math.sqrt(5), 2), approx);
        assertEquals(2.0, Plane.TRIANGLE.area(Math.sqrt(5), 2, Math.sqrt(5)), approx);
        assertEquals(2.0, Plane.TRIANGLE.area(2, Math.sqrt(5), Math.sqrt(5)), approx);
    }

    @Test
    void testAreaIsTriangleScalene() {
        assertEquals(6.0, Plane.TRIANGLE.area(3, 4, 5), approx);
        assertEquals(6.0, Plane.TRIANGLE.area(3, 5, 4), approx);
        assertEquals(6.0, Plane.TRIANGLE.area(4, 3, 5), approx);
        assertEquals(6.0, Plane.TRIANGLE.area(4, 5, 3), approx);
        assertEquals(6.0, Plane.TRIANGLE.area(5, 4, 3), approx);
        assertEquals(6.0, Plane.TRIANGLE.area(5, 3, 4), approx);
    }

    @Test
    void testPerimeterForInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> Plane.TRIANGLE.perimeter(1, 2,
                3));
    }

    @Test
    void testPerimeterForNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> Plane.TRIANGLE.perimeter(-1, 1,
                1));
        assertThrows(IllegalArgumentException.class, () -> Plane.TRIANGLE.perimeter(1, -1,
                1));
        assertThrows(IllegalArgumentException.class, () -> Plane.TRIANGLE.perimeter(1, 1,
                -1));
    }

    @Test
    void testAreaForInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> Plane.TRIANGLE.area(1, 2, 3));
    }

    @Test
    void testAreaForNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> Plane.TRIANGLE.area(-1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> Plane.TRIANGLE.area(1, -1, 1));
        assertThrows(IllegalArgumentException.class, () -> Plane.TRIANGLE.area(1, 1, -1));
    }
}

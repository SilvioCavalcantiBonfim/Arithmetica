package test;

import org.junit.jupiter.api.Test;

import geometry.Space;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SphereTest {

  private static final double approx = 0.001;

  @Test
  void testCalculateSurfaceArea() {
    assertEquals(4.0 * Math.PI, Space.SPHERE.surfaceArea(1.0), approx);
    assertEquals(16.0 * Math.PI, Space.SPHERE.surfaceArea(2.0), approx);
  }

  @Test
  void testCalculateVolume() {
    assertEquals((4.0/3.0) * Math.PI, Space.SPHERE.volume(1.0), approx);
    assertEquals((4.0/3.0) * 8 * Math.PI, Space.SPHERE.volume(2.0), approx);
  }

  @Test
  void testValidateArgs() {
    assertThrows(IllegalArgumentException.class, () -> Space.SPHERE.volume(1.0, 2.0));
    assertThrows(IllegalArgumentException.class, () -> Space.SPHERE.volume());
    assertThrows(IllegalArgumentException.class, () -> Space.SPHERE.surfaceArea(1.0, 2.0));
    assertThrows(IllegalArgumentException.class, () -> Space.SPHERE.surfaceArea());
  }
}
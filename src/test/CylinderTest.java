package test;

import org.junit.jupiter.api.Test;

import geometry.Space;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CylinderTest {

  private static final double approx = 0.001;

  @Test
  void testCalculateSurfaceArea() {
    assertEquals(4.0 * Math.PI, Space.CYLINDER.surfaceArea(1.0, 1.0), approx);
    assertEquals(20.0 * Math.PI, Space.CYLINDER.surfaceArea(2.0, 3.0), approx);
  }

  @Test
  void testCalculateVolume() {
    assertEquals(Math.PI * Math.pow(1.0, 2.0) * 1.0, Space.CYLINDER.volume(1.0, 1.0), approx);
    assertEquals(Math.PI * Math.pow(2.0, 2.0) * 2.0, Space.CYLINDER.volume(2.0, 2.0), approx);
  }

  @Test
  void testValidateArgs() {
    assertThrows(IllegalArgumentException.class, () -> Space.CYLINDER.volume(1.0));
    assertThrows(IllegalArgumentException.class, () -> Space.CYLINDER.volume(1.0, 2.0, 3.0));
    assertThrows(IllegalArgumentException.class, () -> Space.CYLINDER.surfaceArea(1.0));
    assertThrows(IllegalArgumentException.class, () -> Space.CYLINDER.surfaceArea(1.0, 2.0, 3.0));
  }
}

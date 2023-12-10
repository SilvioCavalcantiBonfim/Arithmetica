package test;

import org.junit.jupiter.api.Test;

import geometry.Space;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CubeTest {

  private static final double approx = 0.001;

  @Test
  void testCalculateSurfaceArea() {
    
    assertEquals(6.0, Space.CUBE.surfaceArea(1.0), approx);
    assertEquals(24.0, Space.CUBE.surfaceArea(2.0), approx);
  }

  @Test
  void testCalculateVolume() {
    assertEquals(1.0, Space.CUBE.volume(1.0), approx);
    assertEquals(8.0, Space.CUBE.volume(2.0), approx);
  }

  @Test
  void testValidateArgs() {
    assertThrows(IllegalArgumentException.class, () -> Space.CUBE.volume(1.0, 2.0));
    assertThrows(IllegalArgumentException.class, () -> Space.CUBE.volume());
    assertThrows(IllegalArgumentException.class, () -> Space.CUBE.surfaceArea(1.0, 2.0));
    assertThrows(IllegalArgumentException.class, () -> Space.CUBE.surfaceArea());
  }
}
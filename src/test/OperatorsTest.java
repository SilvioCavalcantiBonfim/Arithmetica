package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import operators.Operators;

public class OperatorsTest {

  @Test
  void SomaIndiscriminada() {
    // 1 + 1.2 + 0.8 = 1 + 2 = 3
    Float expected = 10.7f;
    Float result = Operators.SUM.apply(1, 1.2f, 8.5).floatValue();

    Assertions.assertEquals(expected, result);
  }

  @Test
  void SubtracaoIndiscriminada() {
    // 10 - 1 - 8.5 = 10 - 9.5 = 0.5
    Float expected = 0.5f;
    Float result = Operators.SUBTRACT.apply(10, 1.0f, 8.5).floatValue();
    Assertions.assertEquals(expected, result);
  }

  @Test
  void multiplicacaoIndiscriminada() {
    // 10 * 1 * 8.5 = 10 * 8.5 = 85
    Integer expected = 85;
    Integer result = Operators.MULTIPLY.apply(10, 1.0f, 8.5).intValue();
    Assertions.assertEquals(expected, result);
  }

  @Test
  void divisaoIndiscriminada() {
    // 10 / 1 * 8.5 / 2 = 10 * 8.5 = 85
    Integer expected = 43;
    Integer result = Operators.DIVISION.apply(10, 1.0f, 8.6, 2).intValue();
    Assertions.assertEquals(expected, result);
  }

  @Test
  void divisaoComZero() {
    ArithmeticException arithmeticException = Assertions.assertThrows(ArithmeticException.class, () -> Operators.DIVISION.apply(10, 1, 2, 0));
    Assertions.assertEquals(arithmeticException.getMessage(),"The 4th number is zero, which is not allowed as a divisor.");
  }
}

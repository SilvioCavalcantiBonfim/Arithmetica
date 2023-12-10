package geometry;

import java.util.Arrays;

/**
 * Esta é uma classe final que estende a classe Polygon e representa um triângulo.
 * Ela fornece métodos para calcular propriedades de um triângulo.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 09/12/2023
 */
final class Triangle extends Polygon {

  /**
   * Constante que representa o número total de lados em um triângulo.
   */
  private static final int TOTAL_SIDE = 3;

  /**
   * Valida se os lados fornecidos podem formar um triângulo.
   *
   * @param side os comprimentos dos lados do triângulo
   * @throws IllegalArgumentException se os lados fornecidos não formarem um triângulo
   */
  @Override
  protected void validateTypePolygon(double... side) throws IllegalArgumentException {
    if (side.length != TOTAL_SIDE) {
      throw new IllegalArgumentException("A triangle must have three sides");
    }
    if (!isValidByInequality(side)) {
      throw new IllegalArgumentException("The sides do not form a triangle.");
    }
  }

  /**
   * Calcula a área do triângulo para os lados dados usando a fórmula de Herão.
   *
   * @param side os comprimentos dos lados do triângulo
   * @return a área do triângulo
   */
  @Override
  protected double calculateAreaForSide(double... side) {
    double semiperimeter = this.perimeter(side) / 2;
    Double productSide = Arrays.stream(side).map((s) -> semiperimeter - s).reduce(1.0, (a,b) -> a*b);
    return Math.sqrt(semiperimeter * productSide);
  }
}

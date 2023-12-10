package geometry;

/**
 * Esta é uma classe final que estende a classe Polygon e representa um
 * retângulo.
 * Ela fornece métodos para calcular a área e o perímetro de um retângulo.
 * Como esta classe é final, ela não pode ser estendida.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 09/12/2023
 */

final class Rectangle extends Polygon {
  /**
   * Constante que representa o número total de lados em um retângulo.
   */
  private static final int TOTAL_SIDE = 4;

  /**
   * Valida se os lados fornecidos podem formar um retângulo.
   *
   * @param side os comprimentos dos lados do retângulo
   * @throws IllegalArgumentException se os lados fornecidos não formarem um
   *                                  retângulo
   */
  @Override
  protected void validateTypePolygon(double... side) throws IllegalArgumentException {
    if (side.length != TOTAL_SIDE) {
      throw new IllegalArgumentException("A rectangle must have three sides");
    }
    if (side[0] != side[2] || side[1] != side[3]) {
      throw new IllegalArgumentException("The sides do not form a rectangle.");
    }
  }
  /**
   * Calcula a área do retângulo para os lados dados.
   *
   * @param side os comprimentos dos lados do retângulo
   * @return a área do retângulo
   */
  @Override
  protected double calculateAreaForSide(double... side) {
    return side[0] * side[1];
  }
}

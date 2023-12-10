package geometry;

/**
 * Esta é uma classe final que estende a classe Polyhedron e representa um cubo.
 * Ela fornece métodos para calcular a área da superfície e o volume de um cubo.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 10/12/2023
 */

final class Cube extends Polyhedron {

  /**
   * Constante que representa o número total de argumentos necessários para um
   * cubo.
   */
  private static final int TOTAL_ARGS = 1;

  /**
   * Calcula a área da superfície do cubo para o argumento dado.
   *
   * @param args o comprimento do lado do cubo
   * @return a área da superfície do cubo
   */
  @Override
  protected double calculateSurfaceAreaForArguments(double... args) {
    return 6.0 * Math.pow(args[0], 2.0);
  }

  /**
   * Calcula o volume do cubo para o argumento dado.
   *
   * @param args o comprimento do lado do cubo
   * @return o volume do cubo
   */
  @Override
  protected double calculateVolumeForArguments(double... args) {
    return Math.pow(args[0], 3.0);
  }

  /**
   * Valida se o argumento fornecido pode formar um cubo.
   *
   * @param args o comprimento do lado do cubo
   * @throws IllegalArgumentException se o argumento fornecido não formar um cubo
   */
  @Override
  protected void validateArgs(double... args) throws IllegalArgumentException {
    if (args.length != TOTAL_ARGS) {
      throw new IllegalArgumentException("A cube has only one argument.");
    }
  }

}

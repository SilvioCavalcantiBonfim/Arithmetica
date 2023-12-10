package geometry;

/**
 * Esta é uma classe final que estende a classe Polyhedron e representa um
 * cilindro.
 * Ela fornece métodos para calcular a área da superfície e o volume de um
 * cilindro.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 10/12/2023
 */
final class Cylinder extends Polyhedron {
  /**
   * Constante que representa o número total de argumentos necessários para um
   * cilindro.
   */
  private static final int TOTAL_ARGS = 2;

  /**
   * Calcula a área da superfície do cilindro para os argumentos dados.
   *
   * @param args os raios e altura do cilindro
   * @return a área da superfície do cilindro
   */
  @Override
  protected double calculateSurfaceAreaForArguments(double... args) {
    return 2.0 * Math.PI * args[0] * (args[0] + args[1]);
  }

  /**
   * Calcula o volume do cilindro para os argumentos dados.
   *
   * @param args os raios e altura do cilindro
   * @return o volume do cilindro
   */
  @Override
  protected double calculateVolumeForArguments(double... args) {
    return Math.PI * Math.pow(args[0], 2.0) * args[1];
  }

  /**
   * Valida se os argumentos fornecidos podem formar um cilindro.
   *
   * @param args os raios e altura do cilindro
   * @throws IllegalArgumentException se os argumentos fornecidos não formarem um
   *                                  cilindro
   */
  @Override
  protected void validateArgs(double... args) throws IllegalArgumentException {
    if (args.length != TOTAL_ARGS) {
      throw new IllegalArgumentException("A cube has only one argument.");
    }
  }

}

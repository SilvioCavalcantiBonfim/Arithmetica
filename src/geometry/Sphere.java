package geometry;

/**
 * Esta é uma classe final que estende a classe Polyhedron e representa uma esfera.
 * Ela fornece métodos para calcular a área da superfície e o volume de uma esfera.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 10/12/2023
 */
final class Sphere extends Polyhedron{

  /**
   * Constante que representa o número total de argumentos necessários para uma esfera.
   */
  private static final int TOTAL_ARGS = 1;

  /**
   * Calcula a área da superfície da esfera para o argumento dado.
   *
   * @param args o raio da esfera
   * @return a área da superfície da esfera
   */
  @Override
  protected double calculateSurfaceAreaForArguments(double... args) {
    return 4.0*Math.PI*Math.pow(args[0], 2.0);
  }

  /**
   * Calcula o volume da esfera para o argumento dado.
   *
   * @param args o raio da esfera
   * @return o volume da esfera
   */
  @Override
  protected double calculateVolumeForArguments(double... args) {
    return (4.0/3.0)*Math.PI*Math.pow(args[0], 3.0);
  }

  /**
   * Valida se o argumento fornecido pode formar uma esfera.
   *
   * @param args o raio da esfera
   * @throws IllegalArgumentException se o argumento fornecido não formar uma esfera
   */
  @Override
  protected void validateArgs(double... args) throws IllegalArgumentException {
    if (args.length != TOTAL_ARGS) {
      throw new IllegalArgumentException("A sphere has only one argument.");
    }
  }
  
}

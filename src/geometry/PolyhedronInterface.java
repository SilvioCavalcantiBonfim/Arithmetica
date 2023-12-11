package geometry;

/**
 * Esta é uma interface pública que representa um poliedro.
 * Ela fornece métodos para calcular a área da superfície e o volume de um poliedro.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 10/12/2023
 */
interface PolyhedronInterface {

  /**
   * Calcula a área da superfície do poliedro.
   *
   * @param args os argumentos do poliedro
   * @return a área da superfície do poliedro
   * @throws IllegalArgumentException se os argumentos forem invalidos
   */
  public double surfaceArea(double... args) throws IllegalArgumentException;

  /**
   * Calcula o volume do poliedro.
   *
   * @param args os argumentos do poliedro
   * @return o volume do poliedro
   * @throws IllegalArgumentException se os argumentos forem invalidos
   */
  public double volume(double... args) throws IllegalArgumentException;
}

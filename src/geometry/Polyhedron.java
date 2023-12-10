package geometry;

import java.util.Arrays;

/**
 * Esta é uma classe abstrata que implementa a interface PolyhedronInterface e
 * representa um poliedro.
 * Ela fornece métodos para calcular a área da superfície e o volume de um
 * poliedro.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 10/12/2023
 */

abstract class Polyhedron implements PolyhedronInterface {
  /**
   * Calcula a área da superfície do poliedro para os argumentos dados.
   *
   * @param args os argumentos do poliedro que podem variar dependendo do poliedro
   * @return a área da superfície do poliedro
   * @throws IllegalArgumentException se os argumentos fornecidos não formarem um
   *                                  poliedro
   */
  @Override
  public double surfaceArea(double... args) throws IllegalArgumentException {
    if (!allArgumentsIsPositive(args)) {
      throw new IllegalArgumentException("All arguments of a polyhedron must be positive.");
    }
    validateArgs(args);
    return calculateSurfaceAreaForArguments(args);
  }

  /**
   * Calcula o volume do poliedro para os argumentos dados.
   *
   * @param args os argumentos do poliedro que podem variar dependendo do poliedro
   * @return o volume do poliedro
   * @throws IllegalArgumentException se os argumentos fornecidos não formarem um
   *                                  poliedro
   */
  @Override
  public double volume(double... args) throws IllegalArgumentException {
    if (!allArgumentsIsPositive(args)) {
      throw new IllegalArgumentException("All arguments of a polyhedron must be positive.");
    }
    validateArgs(args);
    return calculateVolumeForArguments(args);
  }

  /**
   * Verifica se todos os argumentos do poliedro são positivos.
   *
   * @param side os argumentos do poliedro
   * @return verdadeiro se todos os argumentos do poliedro são positivos, falso caso
   *         contrário
   */
  private static boolean allArgumentsIsPositive(double... side) {
    return Arrays.stream(side).noneMatch(e -> e <= 0);
  }

  /**
   * Método abstrato para calcular a área da superfície do poliedro para os
   * argumentos dados.
   *
   * @param args os argumentos do poliedro
   * @return a área da superfície do poliedro
   */
  protected abstract double calculateSurfaceAreaForArguments(double... args);

  /**
   * Método abstrato para calcular o volume do poliedro para os argumentos dados.
   *
   * @param args os argumentos do poliedro
   * @return o volume do poliedro
   */
  protected abstract double calculateVolumeForArguments(double... args);

  /**
   * Método abstrato para validar se os argumentos fornecidos podem formar um poliedro.
   *
   * @param args os argumentos do poliedro
   * @throws IllegalArgumentException se os argumentos fornecidos não formarem um poliedro
   */
  protected abstract void validateArgs(double... args) throws IllegalArgumentException;
}

package geometry;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Classe abstrata Polygon que representa um polígono genérico.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 09/12/2023
 */

abstract class Polygon implements PolygonInterface {
  /**
   * Calcula o perímetro do polígono.
   *
   * @param side os comprimentos dos lados do polígono
   * @return o perímetro do polígono
   * @throws IllegalArgumentException se algum lado for negativo ou zero
   */
  @Override
  public double perimeter(double... side) throws IllegalArgumentException {
    if (!allSideSizeIsPositive(side)) {
      throw new IllegalArgumentException("All sides of a polygon must be positive.");
    }
    validateTypePolygon(side);
    return Arrays.stream(side).sum();
  }

  /**
   * Calcula a área do polígono.
   *
   * @param side os comprimentos dos lados do polígono
   * @return a área do polígono
   * @throws IllegalArgumentException se algum lado for negativo ou zero
   */
  @Override
  public double area(double... side) throws IllegalArgumentException {
    if (!allSideSizeIsPositive(side)) {
      throw new IllegalArgumentException("All sides of a polygon must be positive.");
    }
    validateTypePolygon(side);
    return calculateAreaForSide(side);
  }

  /**
   * Verifica se todos os lados do polígono são positivos.
   *
   * @param side os comprimentos dos lados do polígono
   * @return true se todos os lados são positivos, false caso contrário
   */
  private static boolean allSideSizeIsPositive(double... side) {
    return Arrays.stream(side).noneMatch(e -> e <= 0);
  }

  /**
   * Verifica se o polígono é válido pela desigualdade dos lados.
   *
   * @param side os comprimentos dos lados do polígono
   * @return true se o polígono é válido, false caso contrário
   */
  protected static boolean isValidByInequality(double... side) {
    final double sumAllSide = Arrays.stream(side).sum();
    return IntStream.range(0, side.length).allMatch(i -> sumAllSide - side[i] > side[i]);
  }

  /**
   * Valida o tipo do polígono.
   *
   * @param side os comprimentos dos lados do polígono
   * @throws IllegalArgumentException se o polígono não for válido
   */
  protected abstract void validateTypePolygon(double... side) throws IllegalArgumentException;

  /**
   * Calcula a área do polígono para os lados dados.
   *
   * @param side os comprimentos dos lados do polígono
   * @return a área do polígono
   */
  protected abstract double calculateAreaForSide(double... side);
}

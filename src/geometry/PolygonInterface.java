package geometry;

interface PolygonInterface {

  /**
   * Calcula o perímetro do polígono.
   *
   * @param side os comprimentos dos lados do polígono
   * @return o perímetro do polígono
   * @throws IllegalArgumentException se algum lado for negativo ou zero
   */
  double perimeter(double... side) throws IllegalArgumentException;

  /**
   * Calcula a área do polígono.
   *
   * @param side os comprimentos dos lados do polígono
   * @return a área do polígono
   * @throws IllegalArgumentException se algum lado for negativo ou zero
   */
  double area(double... side) throws IllegalArgumentException;

}
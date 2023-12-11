package geometry;

/**
 * Enumeração Plane representa diferentes tipos de polígonos em um plano.
 * Atualmente, suporta TRIANGLE (triângulo) e RECTANGLE (retângulo).
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 09/12/2023
 */

public enum Plane implements PolygonInterface {
  /**
   * Representa um triângulo.
   */
  TRIANGLE(new Triangle()),
  /**
   * Representa um retângulo.
   */
  RECTANGLE(new Rectangle());

  /**
   * O polígono associado a esta instância da enumeração.
   */
  private final Polygon polygon;

  /**
   * Construtor para a enumeração Plane.
   *
   * @param polygon o polígono associado a esta instância da enumeração
   */
  Plane(Polygon polygon) {
    this.polygon = polygon;
  }

  /**
   * Calcula o perímetro do polígono associado.
   *
   * @param side os comprimentos dos lados do polígono
   * @return o perímetro do polígono
   * @throws IllegalArgumentException se algum lado for negativo ou zero
   */
  @Override
  public double perimeter(double... side) throws IllegalArgumentException {
    return polygon.perimeter(side);
  }

  /**
   * Calcula a área do polígono associado.
   *
   * @param side os comprimentos dos lados do polígono
   * @return a área do polígono
   * @throws IllegalArgumentException se algum lado for negativo ou zero
   */
  @Override
  public double area(double... side) throws IllegalArgumentException {
    return polygon.area(side);
  }

}

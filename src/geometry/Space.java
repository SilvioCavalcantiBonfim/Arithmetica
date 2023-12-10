package geometry;
/**
 * Esta é uma enumeração pública que implementa a interface PolyhedronInterface e representa um espaço.
 * Ela fornece métodos para calcular a área da superfície e o volume de um poliedro.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 10/12/2023
 */
public enum Space implements PolyhedronInterface{

  /**
   * Representa um cubo no espaço.
   */
  CUBE(new Cube()),

  /**
   * Representa uma esfera no espaço.
   */
  SPHERE(new Sphere()),

  /**
   * Representa um cilindro no espaço.
   */
  CYLINDER(new Cylinder());

  /**
   * O poliedro representado por este elemento do espaço.
   */
  private final Polyhedron polyhedron;

  /**
   * Construtor para um elemento do espaço.
   *
   * @param polyhedron o poliedro representado por este elemento do espaço
   */
  Space(Polyhedron polyhedron){
    this.polyhedron = polyhedron;
  }

  /**
   * Calcula a área da superfície do poliedro para os valores dados.
   *
   * @param values os argumentos do poliedro
   * @return a área da superfície do poliedro
   * @throws IllegalArgumentException se os valores fornecidos não formarem um poliedro
   */
  @Override
  public double surfaceArea(double... values) throws IllegalArgumentException {
    return polyhedron.surfaceArea(values);
  }

  /**
   * Calcula o volume do poliedro para os valores dados.
   *
   * @param values os argumentos do poliedro
   * @return o volume do poliedro
   * @throws IllegalArgumentException se os valores fornecidos não formarem um poliedro
   */
  @Override
  public double volume(double... values) throws IllegalArgumentException {
    return polyhedron.volume(values);
  }
}

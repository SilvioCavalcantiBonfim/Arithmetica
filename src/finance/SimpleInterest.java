package finance;

/**
 * Esta é uma classe final que implementa a interface InterestInterface e representa o cálculo de juros simples.
 * Ela fornece um método para calcular o montante de um investimento com juros simples.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 11/12/2023
 */
final class SimpleInterest implements InterestInterface{
  
  /**
   * Calcula o montante de um investimento com juros simples para os valores de capital, taxa e tempo dados.
   *
   * @param capital o capital inicial do investimento
   * @param rate a taxa de juros do investimento
   * @param time o tempo do investimento
   * @return o montante do investimento
   */
  @Override
  public double amount(double capital, double rate, double time) {
    return capital*(1+rate*time);
  }
  
}

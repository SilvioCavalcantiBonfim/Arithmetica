package finance;

/**
 * Esta é uma enumeração que implementa a os tipo de juros.
 * Ela fornece um método para calcular o montante de um investimento com base no
 * tipo de juros.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 11/12/2023
 */

public enum Interest implements InterestInterface {
  /**
   * Representa o cálculo de juros simples.
   */
  SIMPLE(new SimpleInterest()),
  /**
   * Representa o cálculo de juros compostos.
   */
  COMPOUND(new CompoundInterest());

  /**
   * A interface de juros representada por este elemento de juros.
   */
  private final InterestInterface interest;

  /**
   * Construtor para um elemento de juros.
   *
   * @param interest a interface de juros representada por este elemento de juros
   */
  Interest(InterestInterface interest) {
    this.interest = interest;
  }

  /**
   * Calcula o montante de um investimento para os valores de capital, taxa e
   * tempo dados.
   *
   * @param capital o capital inicial do investimento
   * @param rate    a taxa de juros do investimento
   * @param time    o tempo do investimento
   * @return o montante do investimento
   */
  @Override
  public double amount(double capital, double rate, double time) {
    return this.interest.amount(capital, rate, time);
  }

}

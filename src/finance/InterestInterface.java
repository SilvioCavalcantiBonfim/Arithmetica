package finance;

/**
 * Esta é uma interface que representa um cálculo de juros.
 * Ela fornece um método para calcular o montante de um investimento com base no
 * capital, taxa e tempo.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 11/12/2023
 */

interface InterestInterface {
  /**
   * Calcula o montante de um investimento para os valores de capital, taxa e
   * tempo dados.
   *
   * @param capital o capital inicial do investimento
   * @param rate    a taxa de juros do investimento
   * @param time    o tempo do investimento
   * @return o montante do investimento
   */
  double amount(double capital, double rate, double time);
}

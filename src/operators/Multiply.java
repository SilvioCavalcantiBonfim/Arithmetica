package operators;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;
/**
 * Classe Multiply que implementa a interface Operator.
 * Esta classe é responsável por realizar a operação de multiplicação.
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 08/12/2023
 */
final class Multiply implements Operator {

  private static final DoubleBinaryOperator operator = (a, b) -> a * b;

  @Override
  /**
   * Este método aplica a operação de multiplicação aos números fornecidos.
   * 
   * @param numbers Os números aos quais a operação de multiplicação será aplicada.
   * @return Retorna o resultado da multiplicação dos números fornecidos.
   */
  public final Number apply(Number... numbers) {
    return (Number) Arrays.asList(numbers)
    .parallelStream()
    .mapToDouble(Number::doubleValue)
    .reduce(1.0, operator);
  }
}

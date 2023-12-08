package operators;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

/**
 * Classe Sum que implementa a interface Operator.
 * Esta classe é responsável por realizar a operação de soma.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 08/12/2023
 */

final class Sum implements Operator {

  /**
   * Operador que realiza a operação de soma entre dois números.
   */
  private static final DoubleBinaryOperator operator = (a, b) -> a + b;
  
  @Override
  /**
   * Aplica a operação de soma a um conjunto de números.
   *
   * @param numbers Conjunto de números aos quais a operação de soma será aplicada.
   * @return O resultado da soma dos números.
   */
  public final Number apply(Number... numbers) {
    return (Number) Arrays.asList(numbers)
    .parallelStream()
    .mapToDouble(Number::doubleValue)
    .reduce(0.0, operator);
  }
}

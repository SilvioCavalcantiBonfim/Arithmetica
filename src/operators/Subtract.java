package operators;

import java.util.stream.IntStream;

/**
 * Classe Sum que implementa a interface Operator.
 * Esta classe é responsável por realizar a operação de subtração.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 08/12/2023
 */

final class Subtract implements Operator {

  @Override
  /**
   * Este método aplica a operação de subtração aos números fornecidos.
   * 
   * @param numbers Os números aos quais a operação de subtração será aplicada.
   * @return Retorna o resultado da subtração dos números fornecidos.
   */
  public final Number apply(Number... numbers) {
    Number[] numbersForInverter = IntStream.range(0, numbers.length)
    .parallel()
    .mapToDouble((i) -> ((i == 0)? 1 : -1) * numbers[i].doubleValue())
    .boxed()
    .toArray(Number[]::new);
    return (new Sum()).apply(numbersForInverter);
  }
}

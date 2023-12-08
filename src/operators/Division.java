package operators;

import java.util.function.IntToDoubleFunction;
import java.util.stream.IntStream;

/**
 * Classe Division que implementa a interface Operator.
 * Esta classe é responsável por realizar a operação de divisão real.
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 08/12/2023
 */

final class Division implements Operator {

  @Override
  /**
   * Este método aplica a operação de divisão real aos números fornecidos.
   * 
   * @param numbers Os números aos quais a operação de divisão real será aplicada.
   * @return Retorna o resultado da divisão real dos números fornecidos.
   * @throws ArithmeticException Se ocorrer uma tentativa de divisão por zero.
   */
  public final Number apply(Number... numbers) throws ArithmeticException {
    Number[] numbersForInverter = IntStream.range(0, numbers.length)
    .parallel()
    .mapToDouble(invertion(numbers))
    .boxed()
    .toArray(Number[]::new);
    return (new Multiply()).apply(numbersForInverter);
  }

  /**
   * Este método auxiliar inverte os números fornecidos.
   * 
   * @param numbers Os números a serem invertidos.
   * @return Retorna uma função que inverte os números fornecidos.
   * @throws ArithmeticException Se ocorrer uma tentativa de divisão por zero.
   */
  private IntToDoubleFunction invertion(Number... numbers) throws ArithmeticException {
    return (i) -> {
      if (i%2 == 1) {
        if (numbers[i].doubleValue() == 0) {
          throw new ArithmeticException("The " + (i+1) + "th number is zero, which is not allowed as a divisor.");
        }
        return 1/numbers[i].doubleValue();
      }else{
        return numbers[i].doubleValue();
      }
    };
  }
}

package operators;

/**
 * Enumeração dos operadores.
 * Cada operador é uma instância de uma classe que implementa a interface
 * Operator.
 * 
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 08/12/2023
 */

public enum Operators {

  /**
   * Operador de soma.
   * Este operador realiza a operação de soma em sequência nos números fornecidos
   * pelo método {@code apply}.
   * A operação é realizada da seguinte maneira:
   * <p>
   * <img src=
   * "https://raw.githubusercontent.com/SilvioCavalcantiBonfim/Arithmetica/0.1.0/docs/Sum.png">
   * <p>
   * Onde:
   * <ul>
   * <li>N&#8321, N&#8322, ..., Nn são os números fornecidos.</li>
   * <li>A operação de soma é realizada entre todos os números fornecidos em
   * sequência.</li>
   * </ul>
   */
  SUM(new Sum()),

  /**
   * Operador de subtração.
   * Este operador realiza a operação de subtração em sequência nos números
   * fornecidos pelo método {@code apply}.
   * A operação é realizada da seguinte maneira:
   * <p>
   * <img src=
   * "https://raw.githubusercontent.com/SilvioCavalcantiBonfim/Arithmetica/0.1.0/docs/Subtract.png">
   * <p>
   * Onde:
   * <ul>
   * <li>N&#8321, N&#8322, ..., Nn são os números fornecidos.</li>
   * <li>A operação de subtração é realizada entre todos os números fornecidos em
   * sequência.</li>
   * </ul>
   */
  SUBTRACT(new Subtract()),

  /**
   * Operador de multiplicação.
   * Este operador realiza a operação de multiplicação em sequência nos números
   * fornecidos pelo método {@code apply}.
   * A operação é realizada da seguinte maneira:
   * <p>
   * <img src=
   * "https://raw.githubusercontent.com/SilvioCavalcantiBonfim/Arithmetica/0.1.0/docs/Multiply.png">
   * <p>
   * Onde:
   * <ul>
   * <li>N&#8321, N&#8322, ..., Nn são os números fornecidos.</li>
   * <li>A operação de multiplicação é realizada entre todos os números
   * fornecidos.</li>
   * </ul>
   */
  MULTIPLY(new Multiply()),
  
  /**
   * Operador de divisão.
   * Este operador realiza a operação de divisão em sequência nos números
   * fornecidos pelo método {@code apply}.
   * A operação é realizada da seguinte maneira:
   * <p>
   * <img src=
   * "https://raw.githubusercontent.com/SilvioCavalcantiBonfim/Arithmetica/0.1.0/docs/Division.png">
   * <p>
   * Onde:
   * <ul>
   * <li>N&#8321, N&#8322, ..., Nn são os números fornecidos.</li>
   * <li>A operação de divisão é realizada entre cada par de números (por exemplo,
   * N&#8321 e N&#8322, N&#8323 e N&#8324, etc.).</li>
   * <li>O resultado de cada operação de divisão é então multiplicado pelo próximo
   * resultado de divisão na sequência.</li>
   * </ul>
   * @throws ArithmeticException Se tentar uma divisão por zero.
   */
  DIVISION(new Division());

  private final Operator operator;

  Operators(Operator operator) {
    this.operator = operator;
  }

  /**
   * Este método aplica o operador escolhido aos números fornecidos.
   * 
   * @param firstNumber  O primeiro número na operação.
   * @param secondNumber O segundo número na operação.
   * @param otherNumbers Qualquer número adicional na operação.
   * @return Retorna o resultado da operação aplicada aos números fornecidos.
   * @throws ArithmeticException Se ocorrer uma tentativa de divisão por zero.
   */
  public Number apply(Number firstNumber, Number secondNumber, Number... otherNumbers) throws ArithmeticException {
    Number[] arrayNumber = new Number[otherNumbers.length + 2];
    arrayNumber[0] = firstNumber;
    arrayNumber[1] = secondNumber;
    System.arraycopy(otherNumbers, 0, arrayNumber, 2, otherNumbers.length);
    return this.operator.apply(arrayNumber);
  }
}

package operators;

/**
 * A interface Operator define um contrato para operações matemáticas.
 * Esta é uma interface selada que permite as implementações Sum, Subtract,
 * Multiply e Division.
 * Cada implementação desta interface deve fornecer uma maneira de aplicar a
 * operação específica.
 *
 * @author Silvio Cavalcanti Bonfim
 * @version 1.0
 * @since 08/12/2023
 */

public sealed interface Operator permits Sum, Subtract, Multiply, Division {
  /**
   * Aplica a operação matemática definida na implementação da interface a um
   * conjunto de números.
   * O método aceita um número variável de argumentos e retorna um Number que é o
   * resultado da operação.
   *
   * @param numbers um array variável de números aos quais a operação matemática
   *                será aplicada.
   * @return um Number que é o resultado da aplicação da operação matemática.
   */
  public Number apply(Number... numbers);
}

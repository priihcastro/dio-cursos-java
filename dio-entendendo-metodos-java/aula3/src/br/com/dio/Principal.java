package br.com.dio;

public class Principal {
    public static void main(String[] args) {
        /*Curso Entendendo Métodos Java:

        Aula 3 - Retornos:

        O que é?
        O return é uma instrução de interrupção, atrelado ao método.

        Também existem o continue e o break, que estão mais ligadas à estruturas de repetição.


        Funcionamento do return:

        O método executa seu retorno quando:
        - Completa todas suas instruções internas.
        - Chega a uma declaração explicita de retorno.
        - Lança uma exceção.


        Considerações:

        - O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto.

        - O tipo de dado do return deve ser compatível com o do método.

        - Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução.


        Exemplos:

        public String getMensagem() {  |  public void setIdade() {
           return "Olá!";	           |    return 10; //erro
        }			                   |  }
                                       |
        public double getJuros() {     |  public void executar() {
           return 2.36;		           |     ...
        }			                   |     return;
                                       |     ...
        public int getParcelas() {     |  }
           return 1.36f;  //erro       |
        }			                   |


        Exercício da Aula 3:
        Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. Agora faça os métodos retornarem valores. */

        System.out.println("Exercício da Aula 3: Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}

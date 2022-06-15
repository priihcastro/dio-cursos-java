package br.com.dio;

public class Principal {

       public static void main(String[] args) {

               /* Existem 4 tipos de "variáveis" no Java:

           Instância: objeto.
           Classe: classe.
           Local: dentro de métodos.
           Parâmetro: na assinatura(chamada) do método.

            ---------------------------------------------*/

              /* Padrão de uma variável:

           <?visibilidade?> <?modificador?> tipo nome <?=valorInicial?>;

           ?: campo não obrigatório para criação de uma variável.
           V(visibilidade): "public", "protected" e "private".
           M(modificador): "static" e "final"(final define um valor constante).
           T(tipo): tipo de dado.
           N(nome): nome que é fornecido a variável.
           VI(valorInicial): um valor inicial, se desejado.

            ---------------------------------------------*/

              /* Regras e boas práticas para criação de nome de variável:

           Regras:

           Não devem começar com números.
           Evitar o uso de "$" e "_".
           Case-sensitive: sensível a maiúsculo e minúsculo.
           Sem espaços.
           Não é permitido uso de palavras reservadas do Java.


           EXEMPLOS:                                     */
              int i; //tratada de uma forma.
              // int i; variáveis não podem ter o mesmo nome.
              int I; //tratada de outra forma.
              //int 1a; não deve iniciar com números.
              int _1a; //evitar uso do "_", principalmente no início do nome.
              int $aq; //evitar uso do "$", principalmente no início do nome.

              //Atribuindo valores:
              i = 5;
              I = 10;
              _1a = 20;
              $aq = 7;

              //Mais exemplos:
              final int j = 10;
              //j = 15; variáveis com modificador "final" não podem mudar de valor.
              int asrn24678md;
              //int asrn2$46 78md; não é possível usar espaços em nomes de variáveis.
              int asrn2$4678_md; //nome correto, porém com uso de "_" e "$"
              //int asrn2$46%78_md; proibido o uso de caracteres especiais(Ex: "%").

              //Atribuindo valores:
              asrn24678md = 100;
              asrn2$4678_md = 10;

              /*
           Boas Práticas:

           Sempre começar com letra minúscula.
           Nomes expressivos(autoexplicativo): que dê para entender para quê é usado.
           Notação camelo: camelCase(Exemplo: minhaVariavel).
           Variável com modificador "final": nome inteiro em maiúsculo e, se houver
           mais de uma palavra, separar por "_".

           EXEMPLOS:                                    */
              int quantidadeProduto = 50; //nome expressivo e uso de camelCase.
              //int QuantidadeProduto; não utilizar a primeira letra em maiúscula.
              final int NUMERO_TENTATIVAS = 5; //nome adequado para variável final.
              //final int numeroTentativas = 5; nome inadequado para variável final.
              int QUANTIDADE_OPCOES = 25; //nome correto, porém inadequado
              //int qtdProd; nome não expressivo.

              //Exibindo valores de todas as variáveis criadas:
              System.out.println(i);
              System.out.println(I);
              System.out.println(_1a);
              System.out.println($aq);

              System.out.println(j);
              System.out.println(asrn24678md);
              System.out.println(asrn2$4678_md);

              System.out.println(quantidadeProduto);
              System.out.println(NUMERO_TENTATIVAS);
              System.out.println(QUANTIDADE_OPCOES);


       }
}

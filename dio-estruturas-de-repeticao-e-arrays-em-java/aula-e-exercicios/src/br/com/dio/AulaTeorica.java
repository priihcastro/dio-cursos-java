package br.com.dio;

public class AulaTeorica {
    public static void main(String[] args) {
        /*Curso Estruturas de Repetição e Arrays em Java

        Tema 1 - Estruturas de Repetição:

        -O real poder dos computadores está na sua habilidade para repetir uma operação ou uma série de operações
        várias vezes.
        -Cada repetição é chamada laço(loop) é um dos conceitos básicos da programação estruturada.
        -Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso
        determinadas condições sejam satisfeitas.
        -Essas condições são representadas por expressões lógicas.

        As estruturas de repetição podem ser classificadas em:
        -Repetição com teste no início (while)
        -Repetição com teste no final (do-while)
        -Repetição contada (for)

        *O comando break é utilizado para terminar de forma abrupta uma repetição.
        *Quando o comando continue é executado, os comando restantes da repetição são ignorados e o programa volta a
        testar novamente ou não.

        Utilização:

        Repetição com teste no início (while):

               início
                  |
                  v
         -(0)--expressão <--
         |	      |	       |
         |	     (1)	   |
         |	      |	       |
         |	      v	       |
         |    sentença(s)  |
         |	      |	       |
         |	      ----------
         |
         -------->fim


        Repetição com teste no final (do-while):

                início
                  |
                  v
         ----> sentença(s)
         |	      |
         |	      |
         |	      v
         --(1)--expressão
                  |
                 (0)
                  |
                  v
                 fim


        Repetição contada (for):

             inicialização
                    |
                    v
         -(0)---- teste <-----
         |	        |	     |
         |	       (1)	     |
         |	        |	     |
         |	        v	     |
         |      sentença(s)  |
         |	        |	     |
         |	        v	     |
         |      atualização---
         |
         -------->fim


        OPERADORES DE INCREMENTO E DECREMENTO:

        Pré-Fixados:
        -------------------------------------------------------------
        Para:			        |Use o atalho:	|Forma original:
        Somar uma unidade ao 	| ++numero;	    |numero = numero + 1;
        valor da variável	    |		        |(retorne numero)
        ------------------------|---------------|--------------------
        Subtrair uma unidade do | --numero;	    |numero = numero - 1;
        valor variável		    |		        |(retorne numero)
        -------------------------------------------------------------

        Pós-Fixados:
        -------------------------------------------------------------
        Para:			        |Use o atalho:	|Forma original:
        Somar um ao valor da	| 		        |
        variavel, retornando o	| numero++;	    |(retorne numero)
        valor original		    |		        |numero = numero + 1;
        ------------------------|---------------|--------------------
        Subtrair um do valor da | 		        |
        variável, retornando o	| numero--;	    |(retorne numero)
        valor original		    |		        |numero = numero - 1;
        -------------------------------------------------------------


        OPERAÇÕES ARITMÉTICAS:
        -------------------------------------------------------------
        Para:			|Use o atalho:	|Forma original:
        ------------------------|---------------|--------------------
        Somar k unidades ao	    | numero += k;	|numero = numero + 1;
        valor da variável	    |		        |
        ------------------------|---------------|--------------------
        Subtrair k unidades do  | numero -= k;	|numero = numero - 1;
        valor da variável	    |		        |
        ------------------------|---------------|--------------------
        Multiplicar o valor da 	| numero *= k;	|numero = numero * 1;
        variável por k  	    |		        |
        ------------------------|---------------|--------------------
        Dividir o valor da      | numero /= k;	|numero = numero / 1;
        variável por k		    |		        |
        -------------------------------------------------------------



        Tema 2 - Arrays:

        -Array é um objeto utilizado para armazenar sequencialmente dados do mesmo tipo.
        -Permanecem com o mesmo tamanho depois de criados.

        Tipos de Arrays:
        -Unidimensional
        -Multidimensional

        Utilização:

        Array Unidimensional:

        Índice:  |valor armazenado:
        c[0] 	 |-45
        c[1]  	 |6
        c[2]  	 |0
        c[3]  	 |72
        c[4]  	 |1543
        c[5] 	 |-89
        c[6]  	 |0
        c[7]  	 |62
        c[8] 	 |-3
        c[9]  	 |1
        c[10] 	 |6453
        c[11] 	 |78

        *O índice é a posição em que determinado valor armazenado está localizado dentro de um array.


        Array Multidimensional:

                Coluna 0	|    Coluna 1	|    Coluna 2	|    Coluna 3
        Linha 0|    a[0][0]	|    a[0][1]	|    a[0][2]	|    a[0][3]
        Linha 1|    a[1][0]	|    a[1][1]	|    a[1][2]	|    a[1][3]
        Linha 2|    a[2][0]	|    a[2][1]	|    a[2][2]	|    a[2][3]

         a[][]
         | | |
         | | ---> índice de coluna
         | ---> índice de linha
         ---> nome do array  */



    }
}

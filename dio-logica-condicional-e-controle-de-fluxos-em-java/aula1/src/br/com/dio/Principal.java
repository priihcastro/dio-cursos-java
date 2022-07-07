package br.com.dio;

public class Principal {
    public static void main(String[] args) {
        /*Curso Lógica Condicional e Controle de Fluxos em Java:

        Aula 1 - Operadores Relacionais

        O que são?
        Operadores relacionais são símbolos especiais que são capazes de realizar comparações entre determinados
        operandos e, em seguida, retornar um resultado.

        Tipo:
        -Similaridade: igual, diferente
        -Tamanho: maior, maior igual, menor, menor igual

        *Diferente dos operadores aritméticos, os operadores relacionais precisam de no mínimo 2 operandos.

        Utilização:

        Similaridade:
        -Igualdade: determina se um operando é igual ao outro
        -Diferença: determina se um operando não é igual ao outro

        Símbologia:
        -Igualdade: ==
        -Diferença: !=


        Tamanho:
        -Maior: determina se um operando é maior do que o outro
        -Maior igual: determina se um operando é maior ou igual a outro
        -Menor: determina se um operando é menor do que o outro
        -Menor igua: determina se um operando é menor ou igual a outro

        Símbologia:
        -Maior: >
        -Maior igual: >=
        -Menor: <
        -Menor igual: <=

        Exemplos:

        int i1 = 10; int i2 = 20; float f1 = 4.5f; float f2 = 3.5f;
        char c1 = 'x'; char c2 = 'y'; String s1 = "Fulano"; String s2 = "Fulano";
        boolean b1 = true; boolean b2 = false;

        i1 == i2, i1 != i2, i1 > i2, i1 <= i2
        f1 == f2, f1 != f2, f1 >= f2, f1 < f2
        c1 == c2, c1 != c2, c1 > c2, c1 <= c2
        s1 == s2, s1 != s2, s1 >= s2, s1 < s2 //não tem lógica uma string ser menor ou maior que a ourta.
        b1 == b2, b1 != b2, b1 > b2, b1 <= i1 //não tem lógica true ser maior ou menor que false.
        i2 > f1


        Exercício da Aula 1:
        Criar um simples projeto para realizar as comparações anteriores, além de utilizar os demais tipos de dados
        não apresentados */


        //Criando variáveis para o exercício:

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        // Fazendo as comparações com os operadores relacionais e mostrando o resultado na tela

        System.out.println("i1 == i2 -> " + (i1 == i2));
        System.out.println("i1 != i2 -> " + (i1 != i2));
        System.out.println("i1 > i2 -> " + (i1 > i2));
        System.out.println("i1 <= i2 -> " + (i1 <= i2));

        System.out.println("\nf1 == f2 -> " + (i1 == i2));
        System.out.println("f1 != f2 -> " + (i1 != i2));
        System.out.println("f1 >= f2 -> " + (i1 >= i2));
        System.out.println("f1 < f2 -> " + (i1 < i2));

        System.out.println("\nc1 == c2 -> " + (c1 == c2));
        System.out.println("c1 != c2 -> " + (c1 != c2));
        System.out.println("c1 > c2 -> " + (c1 > c2));
        System.out.println("c1 <= c2 -> " + (c1 <= c2));

        System.out.println("\ns1 == s2 -> " + (s1 == s2));
        System.out.println("s1 == s3 -> " + (s1 == s3));
        System.out.println("s1 != s2 -> " + (s1 != s2));
        //System.out.println(s1 >= s2); não há como comparar a grandeza entre strings
        //System.out.println(s1 < s2);

        System.out.println("\nb1 == b2 -> " + (b1 == b2));
        System.out.println("b1 != b2 -> " + (b1 != b2));
        //System.out.println(b1 > b2); não há como comparar a grandeza entre booleanos
        //System.out.println(b1 <= b2);

        System.out.println("\ni2 > f1 -> " + (i2 > f1));
        System.out.println("d1 == h1 -> " + (d1 == h1));
        //System.out.println(s2 != c1); não há como comparar a similaridade entre string e char
        //System.out.println(s3 != i1); não há como comparar a similaridade entre textos e números

        System.out.println("\nl1 == i2 -> " + (l1 == i2));
        System.out.println("l2 >= i1 -> " + (l2 >= i1));
        System.out.println("y1 != h1 -> " + (y1 != h1));




    }
}

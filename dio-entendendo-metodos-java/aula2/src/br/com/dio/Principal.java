package br.com.dio;

public class Principal {
    public static void main(String[] args) {
        /*Curso Entendendo Métodos Java:

        Aula 2 - Sobrecarga:

        O que é?
        "Sobrecarga é a capacidade de definir métodos para diferentes contextos, mas preservando seu nome."

        CRIAÇÃO:

        Alterar a assinatura do método:
        Ass = nome + parâmetros

        Exemplos:

        converterParaInteiro(float f);
        converterParaInteiro(double d);
        converterParaInteiro(string s);
        converterParaInteiro(float f, RoundType rd);
        converterParaInteiro(double d, RoundType rd);
        converterParaInteiro(String s, RoundType rd);

        converterParaInteiro(RoundType rd, String s);
        converterParaInteiro();

        Sobrecarga x Sobrescrita:

        Sobrecarga: manter o nome do método e alterar os parâmetros
        Sobrescrita: relacionado á Orientação a Objetos(herança).


        Exercício da Aula 2: Crie uma aplicação que calcule a área dos 3 quadriláteros notáveis: quadrado, retângulo e
        trapézio. Obs: Use sobrecarga. */

        System.out.println("Exercício da Aula 2: Quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);

    }
}

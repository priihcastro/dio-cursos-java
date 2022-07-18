package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex: 5! = 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplicacao = 1;

        System.out.println("Qual número será calculado o fatorial? ");
        int numero = scan.nextInt();

        for (int i = numero; i >= 1; i --) {
            multiplicacao *= i;
            System.out.println(multiplicacao);
        }
        System.out.println(numero + "! = " + multiplicacao);

    }
}

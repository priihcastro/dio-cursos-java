package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, count = 1, maior = 0, soma = 0;

        do {
            System.out.println("Digite o " + count + "º número: ");
            numero = scan.nextInt();

            soma = soma + numero;
            if (numero > maior) maior = numero;

            count += 1;
        } while(count < 6);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (soma/5));

    }
}

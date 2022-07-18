package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número entre 1 e 10.
O usuário deve informar de qual número quer ver a tabuada.
A saida deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Será feita a tabuada de qual número? ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de: " + numero);

        for(int i = 1;i <= 10; i ++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

    }
}

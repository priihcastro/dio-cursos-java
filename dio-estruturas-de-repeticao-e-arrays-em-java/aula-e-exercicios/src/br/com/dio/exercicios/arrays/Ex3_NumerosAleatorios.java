package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final mostre seus números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random r = new Random();

        int[] numeroAleatorios = new int[20];

        for (int i = 0; i < numeroAleatorios.length; i++) {
            int numero = r.nextInt(100);
            numeroAleatorios[i] = numero;
        }

        System.out.print("Números aleatórios: ");
        for (int numero : numeroAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numeroAleatorios ) {
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nAntecessores dos números aleatórios: ");
        for (int numero : numeroAleatorios ) {
            System.out.print((numero-1) + " ");
        }

    }
}

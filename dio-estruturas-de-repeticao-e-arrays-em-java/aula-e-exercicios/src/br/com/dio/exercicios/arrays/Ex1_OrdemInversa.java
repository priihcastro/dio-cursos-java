package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {9, 18, -3, 29, 47, 12};
        //System.out.println(vetor.length);

        System.out.println("Vetor ordem normal: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\n------------------\nVetor ordem inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}

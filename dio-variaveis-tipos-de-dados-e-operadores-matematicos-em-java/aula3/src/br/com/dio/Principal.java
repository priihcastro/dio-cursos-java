package br.com.dio;

public class Principal {
    public static void main(String[] args) {

        /*Curso: Variáveis, Tipos de Dados e Operadores Matemáticos em Java:

        Aula 3 - Operadores Aritméticos:

        Tipos:

        *exp = exponencial
        -pós-fixado: exp++ ou exp--
        -prefixado: ++exp ou --exp
        -aritmético: +,-,*,/ e %
        -atribuição: =,+=,-=,*=,/= e %=

        Exemplos:

        int i = ++k; -> i = k+1;
        int j = k-- -> j=k; k =k-1;
        float f = 1.5f + 4.5f;
        long l = 10398L * 5L;
        double d = 45d / 4d;
        int k = 15 % 4;
        double d = f;
        i += 5 -> i = i+5;
        j -= 3; -> j = j-3;
        d /= 2.7d; -> d = d/2.7d;
        i *= 3; -> i = i*3;
        k %= 2; -> k  = k%2;

        Precedências(Prioridade de execução):

        Operador       |Precedência
        Pós-fixado.....|exp++, exp--
        Prefixado......|++exp, --exp
        Multiplicativo.|*, /, %
        Aditivo........|+, -
        Atribuição.....|=, +=, -=, *=, /=, %= */

        System.out.println("PrePos");
        prePos();
        System.out.println("PrePos");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }

    private static void prePos() {
        int k = 10;
        int i = ++k; //11
        int j = k--; //10
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b; //30
        int r2 = c-a; //20
        int r3 = d*b; //800
        int r4 = e/a; //5
        int r5 = c%b; //10

        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d*b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%b: " + r5);

    }

    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d: " + d); //3.5

        i += 5; //i = i + 5
        j -= 3; //j = j - 3
        d /= 2.7d; //d = d/2.7d
        l *= 3; //l = l * 3
        k %= 2; //k = k % 2

        System.out.println("i: " + i); //1505
        System.out.println("j: " + j); //12
        System.out.println("d: " + d); //1.2962962962962963
        System.out.println("l: " + l); //1500
        System.out.println("k: " + k); //1

        i = k = j;

        System.out.println("k: " + k); //12
        System.out.println("i: " + i); //12

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; //10 + 19 * 30 -> 10 + 570 -> 580

        System.out.println("i++ + --j * k: " + a);
        System.out.println("i " + i); // 11

        int b = k / --i % 3 + 1; //30 / 10 % 3 + 1 -> 1

        System.out.println("k / --i % 3 + 1: " + b);
        System.out.println("i: " + i); //10

        int c = 2;

        c *= i += 5; //c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; -> c = 2 * 15; c = 30

        System.out.println("c *= i += 5: " + c);

    }

}

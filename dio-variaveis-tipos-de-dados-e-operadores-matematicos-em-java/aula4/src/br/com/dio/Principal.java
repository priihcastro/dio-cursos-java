package br.com.dio;

public class Principal {
    public static void main(String[] args) {

        /*Curso: Variáveis, Tipos de Dados e Operadores Matemáticos em Java:

        Aula 4 - Conversões(casting):

        Tipos de casting:

        -Upcast(implícito): promove um tipo de dado de menor capacidade de armazenamento para um tipo maior.
        Não é necessário dizer para que tipo será promovido, pois a capacidade é maior e sem possibilidade
        de perda de dados.

        -Downcast(explícito): rebaixa um tipo de dado de maior capacidade de armazenamento para um tipo de menor.
        É necessário dizer para qual tipo será rebaixado, pois a capacidade é menor e com possibilidade
        de perda de dados.

        Tabela de utilização:

        XXXXXXX	|byte	short	char	int	long	float	double
        byte	|XXXXX	U - I	char	U - I	U - I	U - I	U - I
        short   |D - E	XXXXX	char	U - I	U - I	U - I	U - I
        char    |D - E	D - E	XXXXX	U - I	U - I	U - I	U - I
        int	|D - E	D - E	D - E	XXXXX	U - I	U - I	U - I
        long	|D - E	D - E	D - E	D - E	XXXXX	U - I	U - I
        float	|D - E	D - E	D - E	D - E	D - E	XXXXX	U - I
        double	|D - E	D - E	D - E	D - E	D - E	D - E	XXXXX

        Legenda: U - I = Upcast - Implícito / D - E = Downcast Explícito


        Exemplos:

        long l; int i = 10; l = i;
        int i; long l = 100; i = (int) l;
        double d; float f = 10.5f; d = f;
        float f; double d = 10.5d; f = (float) d;
        int i; float f = 10.5f; i = (int) f; */

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; //Downcast

        long l1;
        int i1 = 10;
        l1 = i1; //Upcast

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; //Downcast, houve perda de dados.

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; //Downcast, não houve perda de dados.

        double d1;
        float f1 = 10.5f;
        d1 = f1; //Upcast

        float f2;
        float f3;
        double d2 = 10000.58f;
        f2 = (float) d2; //Downcast
        double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;


        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;

        System.out.println("b1: " + b1);


    }
}

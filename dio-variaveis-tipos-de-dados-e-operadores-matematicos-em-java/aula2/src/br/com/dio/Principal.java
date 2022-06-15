package br.com.dio;

public class Principal {
    public static void main(String[] args) {
        /* Curso: Variáveis, Tipos de Dados e Operadores Matemáticos em Java:

        Aula 2 - Tipos de dados:

        Tipificação(varia de acordo com a linguagem de programação):

        -Estática(forte) vs Dinâmica(fraco):
        Estática: Quando uma linguagem obriga a definição do tipo da variável e não permite mudanças

        Dinâmica: Não é obrigado a definir o tipo da variável, sendo detectada pelo sistema.


        -Primitivo vs Composto:
        Primitivos: tipos básicos, atômicos, homoêneos e que a maioria das linguagens oferecem.

        Composto: Muito ligado à orientação a objetos, heterogêneo, composto de vários tipos primitivos.

        OPÇÕES DE TIPOS:

       -Textual:
        char: caracteres de 16-bit unicode (char c = '\u0084'; ou char c = 'T';)
        String: um tipo "especial" (String s = "T";)

        -Numeral:
        byte: -128 até 127 (byte b = 15;)
        short: -32.768 até 32.767 (short s = -15785;)
        int: -2.147.483.648 até 2.147.483.647 (int i = 8515785;)
        long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 (long l = 5938515785L;)
        float: ±3.40282347E+38F (float f = 3.14...f;)
        double: ±1.79769313486231570E+308 (double d = 3.14...d;)

        -Lógico(booleano):
        boolean: true e false (boolean s = false;)

        -Objeto(Relacionado à orientação a objetos)

        UTILIZAÇÃO:

        Tipo de dado     |Valor default(inicial)
        byte.............|.........0
        short............|.........0
        int..............|.........0
        long.............|........0L
        float............|......0.0f
        double...........|......0.0d
        char.............|...'\u0000'
        String(e objetos)|.......null
        boolean..........|......false */


        //EXEMPLOS:

        byte b2 = 25;
        byte b1 = 10;

        //short s2 = 40000; incorreto, pois excede o valor máximo suportado pelo tipo.
        short s1 = 20000;

        //int i1 = -10000000000; incorreto, pois excede o valor mínimo suportado pelo tipo.
        int i2 = 28500;

        long l1 = 1000000000000000000L; //utilizar o "L" em maiúsculo no final do valor do tipo long.
        long l2 = 2004005000500055000L;

        //float f1 = 4.5; incorreto, pois o programa só entende que o valor é float, utilizando o "F" no final.
        float f2 = 10.68F;

        double d1 = 85.69; //a ausência do "D" em valores do tipo double é aceitável, porém não é uma boa prática.
        double d2 = 99.84D;

        char c1 = 'W';
        //char c2 = 'Tw'; //o tipo char só aceita um caractere.
        char c3 = '\u0057'; //uso do unicode para exibir um único caractere com o valor correspondente ao unicode.


        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "Exemplo de uma frase 3 -122 * 1.5+00/33";

        //String dt1 = "09/02/1981"; não é uma boa prática utilizar o tipo String para situações que necessitem
        //de outro tipo.

        boolean bo1 = true;
        boolean bo2 = false;

        //Exibindo na tela os valores de todas as variáveis utilizadas:
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);


    }

}

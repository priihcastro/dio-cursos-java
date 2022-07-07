package br.com.dio;

public class Principal {
    public static void main(String[] args) {
        /*Curso Lógica Condicional e Controle de Fluxos em Java

        Aula 2 - Operadores Lógicos

        O que é?
        Operadores lógicos são símbolos especiais que são capazes de realizar comparações lógicas entre operandos
        lógicos ou expressões e, em seguida, retornar um resultado.

        Tipos:
        -Conjunção: operação lógica que só é verdadeira quando ambos os operadores ou expressões envolvidas são verdade
        -Disjunção
        -Disjunção exclusiva
        -Negação

        *Os operadores lógicos se aplicam somente a outros operadores lógicos ou expressões que retornem valores
        lógicos.


        Conceituação:

        Conjunção: operação lógica que só é verdadeira quando ambos os operadores ou expressões envolvidas são verdade.

                                O-E | O-E | R
        Simbologia: &&			 V  |  V  | V
                                 V  |  F  | F
        Terminologia: and(e)	 F  |  V  | F
                                 F  |  F  | F
                   O = Operando E = Expressão R = Resultado


        Disjunção: operação que só é falsa quando ambos os operadores ou expressões envolvidas são falsos.

                                O-E | O-E | R
        Simbologia: ||			 V  |  V  | V
                                 V  |  F  | V
        Terminologia: or(ou)	 F  |  V  | V
                                 F  |  F  | F
                   O = Operando E = Expressão R = Resultado


        Disjunção exclusiva: operação que só é verdade quando ambos os operadores ou expressões são opostos.

                                 O-E | O-E | R
        Simbologia: ^			 V  |  V  | F
                                 V  |  F  | V
        Terminologia: xor		 F  |  V  | V
                                 F  |  F  | F
                   O = Operando E = Expressão R = Resultado


        Negação: operação que inverte o valor lógico de um operando ou expressão.

        Simbologia: !			    O-E | R
        Terminologia: inverção		 V  | F
                                     F  | V
                        O = Operando E = Expressão R = Resultado


        *Operadores NÃO lógicos que são utilizados para manipular bits:
        Operadores bitwise: & e |
        Operadores shift: ~,>>,>>>,<<,<<<


        Exemplos da utilização dos operadores lógicos:

        boolean b1 = true; boolean b2 = false;
        boolean b3 = true; boolean b4 = false;

        b1 && b2, b1 && b3
        b2 || b3, b2 || b4
        b1 ^ b3, b4 ^ b1
        !b1, !b2
        (i1>i2) || (f2<f1)
        ((i1 + i2) < (f2 - f1)) && true


        BOAS PRÁTICAS:
        Crie variáveis auxiliares para guardar resultados intermediários

        (salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)

        pode ser
        (salarioBaixo) && (muitosDependentes)
        ou
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);


        Exercício da Aula 2:
        Criar um simples projeto e codificar os exemplos anteriores para compreender as operações lógicas.
        Utilize operando e expressões.*/

        //Criando variáveis para o exercício
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        //Executando as comparações entre os valores lógicos e mostrando o resultado na tela.
        System.out.println("b1 && b2 -> " + (b1 && b2));
        System.out.println("b1 && b3 -> " + (b1 && b3));

        System.out.println("b2 || b3 -> " + (b2 || b3));
        System.out.println("b2 || b4 -> " + (b2 || b4));

        System.out.println("b1 ^ b3 -> " + (b1 ^ b3));
        System.out.println("b4 ^ b1 -> " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        //mais exemplos
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + 12) < (f2 - f1)) && true -> " + (((i1 + 12) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) -> " + ((i1 > i2) || (f2 < f1)));

        //Exemplo mostrado na aula 2:


        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio = " + recebeAuxilio);
    }
}

package br.com.dio;

public class Principal {
    public static void main(String[] args) {
        /*Curso Lógica Condicional e Controle de Fluxos em Java

        Aula 2 - Controle de Fluxo

        O que são?
        Controles de fluxo são estruturas que tem a capacidade de direcionar o fluxo de execução do código.

        Tipos:
        -Decisão: if, if-else, if-else-if, switch e operador ternário
        -Repetição: for, while, do while
        -Interrupção: break, continue e teurn
        *Somente o tipo Decisão será abordado neste curso.

        Decisão: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução

        Opções: if(se), switch(escolha) e operador ternário.


        Decisão if:

        Tipos: if, if-else, if-else-if, if-else-if-else

        Código ----> Se -(true)---> fim
                 |
              (false)
                 |
                 V
                fim

        Exemplo de decisão if:

           if	       |  if-else	        |if-else-if
                       |                    |
        if(condição) { |if(condição) {      |if(condição) {
        }	           |} else {	        |} else if(condição) {
                       |}		            |} else {
                       |		            |}

        if(idade > 18) |{ |if(aprovado){  |if(casado && temFilhos) {
        }	           |} else {	      |} else if(casado && semFilhos) {
                       |}		          |} else {
                       |		          |}

        *Dica: se seu código tem uma grande quantidade de operadores de decisão if, é sinal que ele pode ser melhorado.



        Decisão operador ternário:

           |---(true)----|
           |		     v
        condição   ?   exp1  :  exp2  ;
           |			          ^
           |--------------(false)-|

        Exemplo de decisão operador ternário:

        condição ? true : false;	condição ? true : null;
        ligado ? desligar : ligar;	emMovimento ? freia : null;

        *Dica: evite ao máximo de utilizar o operador ternário, para melhor legibilidade e manutenção do código.



        Decisão switch(escolha):

        Código ---> variável
                |
                v
               Caso1 --(true)->
                |
                |(false)
                v
              Caso2 --(true)->
                |
                |(false)
                v
               fim

        Exemplos de decisão switch:

        Variável:	|switch(variável){
        byte		|case1:
        short		| break;
        char		|case...:
        *int		| break;
        *Enum		|default:
        *String		| break;
                    |}
        *opções mais comum


        switch(olhos) {
        case "AZUIS":
         break;
        case "VERDES":
         berak;
        case "CASTANHOS":
         break;
        default:
         berak;
        }


        BOAS PRÁTICAS:

        -Switch é para valores exatos e if para expressões booleanas
        -Evitar usar o default do switch para "cases genéricos"
        -Evitar o efeito "flecha" dos if's
        -Evitar muitos if's aninhados
        -Usar a boa prática da aula 2 para diminuir o tmaanho if


        Exercício da Aula 3:
        Criar um simples projeto e criar variáveis e expressões para usar nas estruturas if e switch.

        Com if, exiba o nome do mês do ano de acordo com seu numero.
        Evite o efeito "flecha". Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para
        assim exibir o texto "Férias".

        Com switch use String para a partir do dia da semana, exibir seu número.
        Ainda no switch, faça outro exemplo onde, se uma variável inteira for entre 1 e 3 exibir o texto "Certo".
        Se for 4 exibir "Errado", se for 5 "Talvez". Para demais valores exibir "Valor indefinido"
        */

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();


    }

    //usando o if else sem boas práticas
    private static void ifFlecha() {

        int mes = 9;
        if(mes == 1) {
            System.out.println("Janeiro");
        } else{
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3)  {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    //usando o if else com boas práticas
    private static void ifSemFlecha() {

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido");
        }
    }


    //forma incorreta de utilizar o if.
    //Nesse caso, a melhor opção seria usar o switch pois o valor a ser descoberto é um valor exato.
    private static void ifFerias() {

        String mes = "julho";
        if ((mes == "julho") || (mes == "dezembro") || (mes == "janeiro")) {
            System.out.println("Férias");
        }
    }

    private static void ifMenor() {
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        //solução 1: menos eficiente
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio");
        }

        //solição 2: mais organizado
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxílio");
        }

        //solução 3: mais eficiente
        boolean recebaAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebaAuxilio) {
            System.out.println("Funcionário deve receber auxílio");
        } else {
            System.out.println("Funcionário não deve receber auxílio");
        }

    }

    private static void switchSemana() {

        String dia = "Terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    private static void switchNumero() {

        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido.");
                break;
        }
    }

    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;

        }
    }

    /* ------------------------------------------------------------------------------------------------------
    Curso Lógica Condicional e Controle de Fluxos em Java

    Aula 4 - Blocos:

    O que é?
    Bloco é um grupo de 0 ou mais códigos quais trabalham em conjunto para executar uma operação.

    Tipos:
    -Locais: dentro de métodos.
    -Estáticos: dentro de classes.
    -Instância: dentro de classes.

    Criação:

    Tipo locais:
    {...}

    Exemplos:

    if(autorizado){			        |if(autorizado){
       CarregarPerfil		        |   ...
       DirecionarPáginaPrincipal	|} else {
    }				                |   ...
                                    |}
    if(menorIdade)			        |
       DirecionarPáginaProibido	    |  */

}

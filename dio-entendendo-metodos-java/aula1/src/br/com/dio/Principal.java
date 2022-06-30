package br.com.dio;

public class Principal {
    public static void main(String[] args) {
        /*Curso Entendendo Métodos Java:

        Aula 1 - Criação:

        Padrão de definição:

               *V	        T		     M	        *R	   *N	      *P	          E	       *C
        <?visibilidade?> <?tipo?> <?modificador?> retorno nome (<?parâmetros?>) <?exceções?> corpo


        Legenda:
        <??> = opcional
        V = "public", "protected" ou "private"
        T = concreto ou abstrato
        M = "static" ou "final"
        R = tipo de dado ou "void"
        N = nome que é fornecido ao método
        P = parâmetros que pode receber
        E = exceções que pode lançar
        C = código que possui ou vazio
        * = mais utilizados

        Exemplos:

        piblic String getNome() {...};
        piblic double calcularTotalNota() {...};
        piblic int verificarDistancia(int coordenada1, coordenada2) {...};
        piblic abstract void executar();
        piblic void alterarFabricante(Fabricante fabricante) {...};
        piblic Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra> compras) {...};

        *public static R N(P) {...}


        Utilização:

        Passa-se uma mensagem através de uma classe ou objeto:

        Chamando por uma classe:
        nome_da_classe.nome_do_metodo(); ou nome_da_classe.nome_do_metodo(...);

        Chamando por um objeto:
        nome_do_objeto.nome_do_metodo(); ou nome_do_objeto.nome_do_metodo(...);

        Exemplos:

        Math.random(); ou Math.sqrt(4);
        *sqrt = raiz quadrada.

        usuario.getEmail(); ou usuario.alterarEndereco(endereco);


        Particularidades:

        Assinatura é a forma de identificar unicamente o método
        Ass = nome + parâmetros

        Exemplo:
        Método:
        public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3) {...}

        Assinatura:
        calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3)
        ------------------

        Construtor e Destrutor: são métodos especiais usados na Orientação a Objetos.

        Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a
        uma classe.


        Passagem de parâmetros:

        -> Por valor(cópia)
        -> Por referência(endereço)

        Por valor(cópia):

        int i = 10;
        public void fazerAlgo (int i) {

            i = i + 10; //a variável só será alterada dentro do método, pois foi feito uma "cópia" da variável.
            System.out.println("Valor de i dentro: " + i);
        }
        System.out.println("Valor de i fora: " + i);

        Boas práticas:

        -> Nomes devem ser descritivos, mas curtos.

        -> Notação camelo:
        verificarSaldo(); executarTransferencia(...); existeDebito();

        -> Deve possuir entre 80 e 120 linhas.

        -> Evite lista de parâmetros longas

        -> Visibilidades adequadas.---------------------------------- */


        /* EXERCÍCIO DA AULA 1:

        Observações:
        Tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto
        Pode chamar um método dentro de outro
        Pode passar como parâmetro, a chamada de um outro método.

        Crie uma aplicação que resolva as seguintes situações:
        1- Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão.
        Sempre 2 valores devem ser passados.*/

        System.out.println("Exercício 1: Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);


        /*2- A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.*/

        System.out.println("\nExercício 2: Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);


        /*3- Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.
        Defina arbitrariamente as faixas que influenciam nos valores.*/

        System.out.println("\nExercício 3: Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);



    }
}

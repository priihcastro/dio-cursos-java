package br.com.dio;

public class Quadrilatero {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return (((baseMaior + baseMenor) * altura) / 2);
    }


    /* Exemplos que dariam erro de compilação:

    public static void xpto(){
        System.out.println("Antes");
        return; //o método não necessita de retorno, pois é do tipo void.
    }

    public static long abc(){
        return 1.6; //o método precisa de um retorno do tipo long, porém foi retornado um valor do tipo double.
    }*/


}

/* 

UNIVESP
PROGRAMAÇÃO DE COMPUTADORES
SEMANA 2
EXERCÍCIO DE APOIO 5

PROGRAMA PARA CÁLCULO DE ÁREAS E CUSTO DE PEÇAS COM FORMAS GEOMÉTRICAS DIVERSAS (TAMGRAM)

*/



//Importação de bibliotecas
import java.util.Scanner;

class CalculadorArea{
    // Declaração de variáveis globais
    static double custoPlastico = 1.5; // Custo por cm2 de Plástico
    static double custoMetal = 2.5; // Custo por cm2 de metal    

    public static double areaQuadrado(double lado){
        // Método para calcular a área de um quadrado
        return lado*lado;
    }
    public static double areaTrianguloReto(double cateto) {
        // Método para calcular a área de um triângulo
        return cateto*cateto/2;
    }
    public static double areaParalelogramo(double base, double altura) {
        // Método para clacular a área de um paralelogramo
        return base*altura;
    }
    public static void main(String[] args) {
        // Método principal do programa
        System.out.println("**** Calculador de Areas ****");      
        
        Scanner input = new Scanner(System.in); // Prepara o sccaner para ler os dados do usuário

        // Leitura do valor inserido pelo usuário
        System.out.print("Entre com o custo da boracha: R$ ");
        double custoBorracha = input.nextDouble();
        //System.out.println(custoBorracha);
        input.close();

        // Cálculo de área das peças de reposição
        double areaPlastico = 3*areaTrianguloReto(5) + 2*areaParalelogramo(7.1, 2.7); // Peças em plástico
        double areaMetal = areaQuadrado(4) + areaTrianguloReto(4); // Peças em metal

        // Cálculo de custos
        double custoTamgram = areaQuadrado(16)*custoMetal; // Cálculo do custo de fabricação de um Tamgram de 16cm de lado  
        double custoTotal = custoPlastico*areaPlastico + custoMetal*areaMetal; // Cálculo do custo total das peças de reposição
        double custoTamgramBorracha = areaQuadrado(10.5)*custoBorracha;

        // Retorno na tela ao usuário
        System.out.println("Area quadrado com 2.5cm de lado: " + areaQuadrado(2.5) + "cm2");
        System.out.println("Area triangulo reto com 4cm de lado: " + areaTrianguloReto(4.0) + "cm2");
        System.out.println("Area paralelogramo com 4cm de base e 2.5cm de altura: " + areaParalelogramo(4, 2.5) + "cm2");
        System.out.println("Custo total das pecas de reposicao: R$ " + custoTotal);
        System.out.println("Custo para fabricar um Tamgram de 16x16 feito em Metal: R$ " + custoTamgram);
        System.out.println("Custo para fabricar um Temgram de 10.5x10.5 feito em Borracha: R$ " + custoTamgramBorracha);
    }
}
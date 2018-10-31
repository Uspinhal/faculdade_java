/*

UNIVESP
PROGRAMAÇÃO DE COMPUTADORES
SEMANA 2
EXERCICIO DE APOIO 6

PROGRAMA PARA CONVERSÃO DE MOEDAS - REAL [R$] PARA DOLAR[US$]

*/

// Importação de bibliotecas
import java.util.Scanner;

class ConversorMoedas{
    
    public static float conversor(float real, float dolar){
        return real/dolar;
    }
    public static void main(String[] args) {
    // Método principal
        System.out.println("******* CONVERSOR DE MOEDAS *******");

        Scanner input = new Scanner(System.in);

        float real;
        float dolar;

        System.out.println("Entre com o valor em Real: R$ ");
        real = input.nextFloat();
        System.out.println("Entre com a cotacao do Dolar: R$ ");
        dolar = input.nextFloat();

        System.out.println("Valor convertido: US$ " + conversor(real, dolar));
        input.close();
    }
}
class CalculadorArea{
// Programa para cálculo de áreas e calcular o custo de peças com formas geométricas //
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
        System.out.println("Calculador de Areas");        
        
        double custoTamgram = areaQuadrado(16)*custoMetal; // Cálculo do custo de fabricação de um Tamgram   
        

        System.out.println("Area quadrado com 2.5cm de lado: " + areaQuadrado(2.5) + "cm2");
        System.out.println("Area triangulo reto com 4cm de lado: " + areaTrianguloReto(4.0) + "cm2");
        System.out.println("Area paralelogramo com 4cm de base e 2.5cm de altura: " + areaParalelogramo(4, 2.5) + "cm2");

        System.out.println("Custo para fabricar um Tamgram de 16x16 feito em Metal: R$ " + custoTamgram);
    }
}
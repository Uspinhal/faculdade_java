import com.sun.jndi.url.iiop.iiopURLContext;

/* 

UNIVESP
PROGRAMAÇÃO DE COMPUTADORES
SEMANA 4
EXERCÍCIO DE APOIO 3

PROGRAMA PARA CÁLCULO DEQUADRADOS E CUBOS

*/

class QuadradosECubos{
    
    public static int quadrados(int num) {
        return(num*num);
    }
    public static int cubos(int num) {
        return(num*num*num);
    }
    public static void main(String[] args) {
        System.out.println("Calculadora de Quadrados e Cubos\n");
        for (int i=1; i<=15;i++){
            System.out.println(i + "\t" + quadrados(i) + "\t" + cubos(i));
        }

    }
}
import java.lang.Math;
import java.util.Scanner;

public class exercicios7 {
    public static void main(String[] args) {


        double raio,perimetro,area,pi;

        Scanner teclado = new Scanner(System.in);
        //calculo + impressao
        
        System.out.println("Escreva seu raio ");
        raio = teclado.nextDouble();
        System.out.println("Digite o valor de pi ");
        pi = teclado.nextDouble();
        
        System.out.println("O valor da area sera de ");
        System.out.println(pi*Math.pow(raio,2));
        perimetro = 2*pi*raio;
        System.out.println("O valor do perimetro do circulo sera de : "+perimetro);





}
}
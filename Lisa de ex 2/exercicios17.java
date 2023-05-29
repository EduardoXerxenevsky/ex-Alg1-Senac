import java.util.Scanner;
import java.lang.Math;

public class exercicios17 {
    public static void main(String[] args) {

        //declarando variavel
        double a,b,hipotenusa;

        Scanner teclado = new Scanner(System.in);
    
        //declarando valores e imprimindo

        System.out.println("Escreva o valor do a (altura)");
        a = teclado.nextDouble();
        System.out.println("Escreva O valor do b (Base)");
        b = teclado.nextDouble(); 

        hipotenusa = (a*a + b*b);

        System.out.println("A Soma dos Catetos é = "+hipotenusa);
        System.out.println("O Valor da Hipotenusa é = "+Math.sqrt(hipotenusa));
}
}
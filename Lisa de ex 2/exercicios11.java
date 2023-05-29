import java.lang.Math;
import java.util.Scanner;
public class exercicios11 {
    public static void main(String[] args) {
        //determinando variavel
        double custokw,x,kw,valor,atraso;
        Scanner teclado = new Scanner(System.in);
        //declarando valores

        
        kw = teclado.nextDouble();
        valor= teclado.nextDouble();
        custokw = valor*1/5;

        //a)

        System.out.println("o custo de cada kw é de "+custokw);

        //b)
        System.out.println("o custo a ser pago sera de " +kw*custokw);

        //c)
        System.out.println("o preço bonus sera de "+((kw*custokw)-0.17*kw*custokw));
        
        //d)

         System.out.println("o preço com o atraso de 10 dias sera de " +((kw*custokw)+0.005*(kw*custokw)*10));
        
}
    }

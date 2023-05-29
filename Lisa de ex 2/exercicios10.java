import java.lang.Math;
import java.util.Scanner;
public class exercicios10 {
    public static void main(String[] args) {
//declaracao de variavel
double a,b,c,delta,x1,x2;
Scanner teclado = new Scanner(System.in);
//calculo
System.out.println("digite o valor de a");
a = teclado.nextDouble();
System.out.println("digite o valor de b ");
b = teclado.nextDouble();
System.out.println("digite o valor de c");
c = teclado.nextDouble();

delta = Math.pow(b,2)-4*a*c;
System.out.println("Delta é igual a "+ delta);
x1 = (-b + Math.sqrt(delta))/2*a;
x2 = (-b - Math.sqrt(delta))/2*a;

//impressao final

System.out.println("O valor de x1 é:"+ x1 + "e o valor de x2 é "+ x2);

   
}
}
import java.util.Scanner;

public class exercicios6 {
    public static void main(String[] args) {

        double base,altura,resultado;
        String nome;
        Scanner teclado = new Scanner(System.in);
//calculo da area + impressao
System.out.println("Digite a base");
base = teclado.nextDouble();
System.out.println("Digite a altura");
altura = teclado.nextDouble();


resultado = base*altura/2;
System.out.println("A area do triangulo sera de "+ resultado);






    }
}
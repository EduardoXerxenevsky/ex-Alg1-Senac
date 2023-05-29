import java.util.Scanner;
public class atv6 {
    public static void main(String[] args) {
    /* Crie um algoritmo que receba como entrada o sexo de uma pessoa (M para
    Masculino e F para Feminino), sua altura (em centímetros) e calcule o seu peso
    ideal, utilizando as seguintes fórmulas:
        a) Homens ➔ 52 + (0,75 * (altura – 152,4))
        b) Mulheres ➔ 52 + (0,67 * (altura – 152,4)) */

        System.out.println("Cálculadora IMC");

        //declarando varaveis
        
        Scanner teclado = new Scanner(System.in);
        String sexo;
        Double pesoideal,alturacm;

        //declaração do usuáro

        System.out.println("Qual é seu sexo? (M para mulher e H para homem): ");
        sexo = teclado.nextLine();
        System.out.println("Qual sua altura em centimetros?: ");
        alturacm = teclado.nextDouble();

        //condicional

        if(sexo.equalsIgnoreCase("M")){
            pesoideal = 52+(0.67*(alturacm-152.4));
        }
        else if(sexo.equalsIgnoreCase("H")){
            pesoideal = 52+(0.67*(alturacm-152.4));
        }
        else{
            System.out.println("Sexo não identificado");
            pesoideal = 0.0;
        }
        System.out.println("Seu peso ideal é: "+pesoideal);
    }
}

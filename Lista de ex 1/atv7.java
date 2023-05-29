import java.util.Scanner;
public class atv7 {
    public static void main(String[] args) {
        /* Crie um algoritmo que leia 3 notas (de 0 a 100) de um aluno e calcule sua média
    ponderada. Para a média ponderada, o algoritmo deve considerar o peso da maior
    nota como sendo 4 e das outras notas como 2. Após o cálculo da média, exibir as
    notas, a média e informar se o aluno está APROVADO (média >= 50),
    RECUPERAÇÃO (média >= 45 e < 50) ou REPROVADO (média < 45). */

    System.out.println("Calculadora de Média");

    //declarando variaveis

    double n1,n2,n3,media;
    Scanner teclado = new Scanner(System.in);

    //declaração do usuario

    System.out.println("Digite sua nota 1");
    n1 = teclado.nextDouble();
    System.out.println("Digite sua nota 2");
    n2 = teclado.nextDouble();
    System.out.println("Digite sua nota 3");
    n3 = teclado.nextDouble();

    //calculo

    media = (4*n1+2*n2+2*n3)/(4+2+2);

    //condicional

    if(media>=50){
        System.out.println("APROVADO");
    }
    else if(media>=45){
        System.out.println("RECUPERAÇÃO");
    }
    else{
        System.out.println("REPROVADO");
    }
    }
}

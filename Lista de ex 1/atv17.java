import java.util.Scanner;
public class atv17 {
    public static void main(String[] args) {
        /*  Crie um algoritmo que receba 3 notas de um aluno e calcule a média. Caso a média
            calculada seja maior ou igual a 6, o algoritmo deverá exibir a mensagem de aluno
            aprovado. Caso a média seja abaixo de 5, o algoritmo deverá exibir a mensagem de
            aluno reprovado. Caso a média esteja entre 5 e 6, o algoritmo deverá exibir que o
            aluno está de recuperação e solicitar a nota da atividade de recuperação, calcular
            uma nova média entre a média inicial e a nota de recuperação e caso esta nova
            média seja abaixo de 6 informar que o aluno está reprovado, caso contrário, informar
            que o aluno está aprovado por recuperação.
        */     

        Scanner teclado = new Scanner(System.in);
        Double n1,n2,n3,nr,media,novamedia;

        System.out.println("Nota 1: ");
        n1 = teclado.nextDouble();
        System.out.println("Nota 2: ");
        n2 = teclado.nextDouble();
        System.out.println("Nota 3: ");
        n3 = teclado.nextDouble();

        //calculo

        media=(n1+n2+n3)/3;

        if(media>=6){
            System.out.println("APROVADO");
        }
        else if(media<5){
            System.out.println("REPROVADO");
        }
        else{
            System.out.println("RECUPERAÇÃO");
            System.out.println("ENVIE A NOTA DA RECUPERAÇÃO: ");
            nr = teclado.nextDouble();
            novamedia=(n1+n2+n3+nr)/4;
            if(novamedia>=6){
                System.out.println("APROVADO POR RECUPERAÇÃO");
                System.out.println(novamedia);
            }
            else{
                System.out.println("REPROVADO");
                System.out.println(novamedia);
            }
            
        }
    }
}

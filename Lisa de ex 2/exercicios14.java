import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {

        //declarando variaveis

        double salario,cheque,saldoatual;
        String nome;

        Scanner teclado = new Scanner(System.in);

        //declarando valores e imprimindo

        System.out.println("informe seu nome e seu salário");

        nome = teclado.nextLine();
        salario = teclado.nextDouble();
        cheque = 0.0076;
        saldoatual = salario-salario*cheque;


        System.out.println("Olá "+nome+" Seu Saldo atual será de "+saldoatual);

}
}
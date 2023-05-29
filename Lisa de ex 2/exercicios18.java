import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {

        //declarando variavel

        String nome;
        Double conta1,conta2,salario;

        Scanner teclado = new Scanner(System.in);

        //declarando valores e imprimindo

        System.out.println("Digite seu nome");
        nome = teclado.nextLine();
        System.out.println("Digite o valor da conta1 em atraso");
        conta1 = teclado.nextDouble();
        System.out.println("Digite o valor da conta2 em atraso");
        conta2 = teclado.nextDouble();
        System.out.println("Digite seu salario");
        salario = teclado.nextDouble();


        conta1 = (conta1*0.02+conta1);
        conta2 = (conta2*0.035+conta2);

        salario = salario - (conta1+conta2);

        System.out.println("Olá "+nome+" Seu salario após pagar as duas contas é de: "+salario);
}
}
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        //determinando variaveis
        Scanner teclado = new Scanner(System.in);
        String cdg;
        int qtd;
        double valor = 0, precototal;
        //inicializando variaveis
        System.out.println("Escreva o código do seu produto");
        cdg = teclado.nextLine();
        System.out.println("Escreva a quantidade que você comprou");
        qtd = teclado.nextInt();
        //estrutura condicional
        switch(cdg.toUpperCase()){
            case "A001":
            valor = 7.5;
            break;
            case "A002":
            valor = 9.9;
            break;
            case "A003":
            valor = 14;
            break;
            case "A004":
            valor = 19.99;
            break;
            default:
            System.out.println("Não reconheço seu produto.");
        }
            precototal = qtd * valor;
            System.out.printf("O preço à pagar será de R$%.2f",precototal);
        teclado.close();
    }
}
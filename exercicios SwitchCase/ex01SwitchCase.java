import java.util.Scanner;
public class Plano {
    public static void main(String[] args) {
        //determinando variaveis
        Scanner teclado = new Scanner(System.in);
        String Plano;
        //inicializando variaveis
        System.out.println("Escreva seu plano de saúde");
        Plano = teclado.nextLine();
        //estrutura condicional
        switch(Plano.toUpperCase().substring(0, 2)){
            case "Bµ":
            case "BA":
            System.out.println("O valor do plano é R$150,00");
            break;
            case "BR":
            System.out.println("O valor do plano é R$220,00");
            break;
            case "PR":
            System.out.println("O valor do plano é R$310,00");
            break;
            case "OU":
            System.out.println("O valor do plano é R$450,00");
            break;
            default:
            System.out.println("Não reconheço seu plano.");
        }
        teclado.close();
    }
}
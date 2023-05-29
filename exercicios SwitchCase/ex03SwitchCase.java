import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        //determinando variaveis
        Scanner teclado = new Scanner(System.in);
        String cdg,cargo="";
        double salario, salarionovo, aumento=0;
        //inicializando variaveis
        System.out.println("Escreva o código do seu cargo");
        cdg = teclado.nextLine();
        //estrutura condicional
        switch(cdg){
            case "1":
            aumento = 0.5;
            cargo = "Escrituário";
            break;
            case "2":
            aumento = 0.35;
            cargo = "Secretário";
            break;
            case "3":
            aumento = 0.2;
            cargo = "Caixa";
            break;
            case "4":
            aumento = 0.1;
            cargo = "Gerente";
            break;
            case "5":
            System.out.println("Você não tem um aumento");
            cargo = "Diretor";
            break;
            default:
            System.out.println("Não reconheço seu cargo.");
            System.exit(0);
        }
        System.out.println("Escreva o seu salário");
        salario = teclado.nextDouble();
            aumento = salario*aumento;
            salarionovo = (aumento + salario);
            System.out.printf("Cargo: %s%nSalário Atual: R$%.2f%nValor do Aumento: R$%.2f%nNovo Salário: R$%.2f",cargo,salario,aumento,salarionovo);
        teclado.close();
    }
}
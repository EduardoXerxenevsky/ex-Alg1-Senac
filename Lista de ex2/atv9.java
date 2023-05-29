import java.util.Scanner;
public class atv9 {
    public static void main(String[] args) {
        /*  Crie um algoritmo que leia o salário de um funcionário, calcule e mostre seu novo
            salário acrescido de bonificação e auxílio escola:
                            Salário                             Bonificação
                    Abaixo de R$ 2000,00 (inclusive)                10%
                    Entre R$ 2000,00 e R$ 3000,00                   8%
                    Acima de R$ 3000,00                             5%
                            Salário                            Auxílio Escola
                    Abaixo de R$ 2500,00 (inclusive)            R$ 350,00
                    Acima de R$ 2500,00                         R$ 300,00   */

                    //Declarando variaveis
            
        Scanner teclado = new Scanner(System.in);
        Double salario,novoSalario,novoSalario2;

        //declaração do usuario

        System.out.print("Digite seu salário: ");
        salario = teclado.nextDouble();
        //condicional

        if(salario<=2000){
            novoSalario = salario*1.10;
        }
        else if(salario<3000){
            novoSalario=salario*1.08;
        }
        else{
            novoSalario=salario*1.05;
        }
        if(novoSalario<=2500){
            novoSalario2=novoSalario+350;
            
        }
        else{
            novoSalario2=novoSalario+300;
            

        }
        System.out.println("O seu salário com as bonificações é de R$"+novoSalario2);
    }
}

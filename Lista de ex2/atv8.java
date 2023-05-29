import java.util.Scanner;
public class atv8 {
    public static void main(String[] args) {
    /*Crie um algoritmo que calcule o salário líquido de acordo com as orientações a
    seguir:
        a) Receber o salário base e gratificação via teclado;
        b) Salário bruto será a soma do salário base com a gratificação;
        c) Se o salário bruto for inferior a R$ 2500,00 incidirá um imposto de 10%, caso
        contrário 15%;
        d) Exibir o salário bruto, a gratificação, o imposto e o salário líquido. */

        Scanner teclado = new Scanner(System.in);
        double salarioliquido,salariobruto,salariobase,impostotaxa,gratificacao;
        String imposto;

        System.out.println("Digite seu salario: ");
        salariobase = teclado.nextDouble();
        System.out.println("Digite sua gratficação: ");
        gratificacao = teclado.nextDouble();
        //CALCULO

        salariobruto = salariobase+gratificacao;

        //condicional

        if(salariobruto<2500){
            impostotaxa = 0.90;
            imposto = "10%";
        }
        else{
            impostotaxa = 0.85;
            imposto = "15%";
        }
        //calculo2
        salarioliquido = salariobruto*impostotaxa;
        System.out.printf("Seu salário bruto é de %f , sua gratficação é de %f o imposto e de %s e seu salário liquido é de %f",salariobruto,gratificacao,imposto,salarioliquido);

    }
}

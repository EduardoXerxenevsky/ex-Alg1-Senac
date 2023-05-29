import java.util.Scanner;
import java.lang.Math;
public class ex5 {
    public static void main(String[] args) {
        /*Desenvolva um algoritmo em que o usuário entre com o tipo de operação que deseja
        realizar (as operações estão descritas abaixo). Em função da operação escolhida o
        programa poderá até solicitar entradas de dados distintas para determinada
        operação. No final, apresentar o resultado.
                            Operação                Fórmula
                                1           𝐴 = (𝐵𝐴𝑆𝐸 ∗ 𝐴𝐿𝑇𝑈𝑅𝐴) /2
                                2           𝑉𝑀 = 𝐸𝑆𝑃𝐴Ç𝑂 / 𝑇𝐸𝑀𝑃𝑂
                                3               𝑃𝑂𝐿 = 𝑀𝑀 / 25,4
                                4               𝐾 = 𝐶 + 273,15
                                5               𝐴 = 𝜋 𝑅^2 */

        Scanner teclado = new Scanner(System.in);
        double area,c,k,mm,pol,raio;
        int cdgop,base,altura,vm,espaco,tempo;

        System.out.println("Informe o código da operação.");
        cdgop = teclado.nextInt();

        switch(cdgop){
            case 1:
            System.out.println("Informe a base");
            base = teclado.nextInt();
            System.out.println("Informe a altura");
            altura = teclado.nextInt();
            area = (base*altura)/2;
            System.out.printf("Sua área é %.0fcm^2",area);
            break;
            case 2:
            System.out.println("Informe o espaço");
            espaco = teclado.nextInt();
            System.out.println("Informe o tempo");
            tempo = teclado.nextInt();
            vm = espaco/tempo;
            System.out.printf("Sua Velocidade média é de %d",vm);
            break;
            case 3:
            System.out.println("Informe os milímetros");
            mm = teclado.nextDouble();
            pol = mm / 25.4;
            System.out.printf("Seu valor em polegadas é %.2f",pol);
            break;
            case 4:
            System.out.println("Informe os graus em Celcius");
            c = teclado.nextDouble();
            k = c+273.15;
            System.out.printf("Seu valor em Kelvin é %.2f",k);
            break;
            case 5:
            System.out.println("Informe seu raio");
            raio = teclado.nextDouble();
            area = Math.PI*Math.pow(raio, 2);
            System.out.printf("Sua área é de %.2fcm^2",area);
            break;
            default:
            System.out.println("Código inválido");
            System.exit(0);
        }
        teclado.close();
    }
}

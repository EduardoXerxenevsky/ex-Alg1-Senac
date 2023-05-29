import java.util.Scanner;
public class atv18 {
    public static void main(String[] args) {

         /* Em uma escola, os alunos ganham premiações de acordo com o seu desempenho
            ao longo do ano letivo, conforme tabela abaixo:

                        Prêmio                           Requisito
                        Excursão                  Nota acima de 80 e 0% de faltas
                        Camiseta                  Nota acima de 80 ou 100% de presença
                        Squeeze                   Nota entre 70 e 80 e 100% de presença
                        Caneta personalizada      Nota entre 70 e 80 ou 100% de presença

            Baseado na tabela, crie um algoritmo que receba 4 notas de um aluno entre 0 e 100,
            quantidade de aulas dadas, quantidade de presenças e informe qual o prêmio a ser
            recebido pelo aluno. Caso o aluno não esteja em nenhuma das condições da tabela, o
            algoritmo deve informar que não há prêmios. */

            Scanner teclado = new Scanner(System.in);
            int n1,n2,n3,n4,m;
            double p,av,ad;

            System.out.print("Nota 1: ");
            n1 = teclado.nextInt();
            System.out.print("Nota 2: ");
            n2 = teclado.nextInt();
            System.out.print("Nota 3: ");
            n3 = teclado.nextInt();
            System.out.print("Nota 4: ");
            n4 = teclado.nextInt();
            System.out.print("Aulas dadas: ");
            ad = teclado.nextInt();
            System.out.print("Aulas Vistas: ");
            av = teclado.nextInt();

            m=(n1+n2+n3+n4)/4;
            p=av/ad;

            if(m>=80 && p == 1){
                System.out.println("Prêmio: Excursão");
            }
            else if (m>=80 || p == 1){
                System.out.println("Prêmio: Camiseta");
            }
            else if (m>=70 && p >= 0.8){
                System.out.println("Prêmio: Squeeze");
            }
            else if (m>=70 || p >= 0.8){
                System.out.println("Prêmio: Caneta Personalizada");
            }
            else{
                System.out.println("Nenhum prêmio recebido");
            }
            System.out.println(p);
            System.out.println(m);
    }
}

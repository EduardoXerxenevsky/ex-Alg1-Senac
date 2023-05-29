import java.util.Scanner;
public class atv13 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*  Crie um algoritmo que receba a hora de início e a hora de término de um jogo (cada
            hora é composta por duas variáveis hora e minuto). Calcule e mostre a duração do
            jogo (horas e minutos), sabendo-se que o tempo máximo da duração do jogo é de
            24 horas e que ele pode iniciar-se em um dia e terminar no dia seguinte.
        */

        Scanner teclado = new Scanner(System.in);
        int h1,m1,h2,m2,hm1,hm2,H24,resultado;
        h1=teclado.nextInt();
        m1=teclado.nextInt();
        h2=teclado.nextInt();
        m2=teclado.nextInt();
        hm1 =(h1*60)+m1;
        hm2 =(h2*60)+m2;
        H24 = 24*60;
        resultado = 0;

        if(hm2 > hm1){
            resultado = hm2-hm1;
            System.out.printf("A duração do jogo é de %d horas e %d minutos \n ",(resultado/60), (resultado % 60));
        }

        else if(hm1 > hm2){
            resultado = (H24 - hm1) - hm2;
            System.out.printf("A duração do jogo é de %d horas e %d minutos \n ",(resultado/60), (resultado % 60));
        }
        else {
            System.out.printf("A duração do jogo é de %d horas e %d minutos \n ",24, 00
             );

        }


    }
}
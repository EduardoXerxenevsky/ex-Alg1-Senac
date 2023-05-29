import java.util.Scanner;
public class atv14 {
    public static void main(String[] args) {
        
        /*  Crie um algoritmo que receba como entrada o valor do saque a ser realizado pelo
            cliente de um banco e retorne quantas notas de cada valor serão necessárias para
            atender ao saque com a menor quantidade de notas possível. Serão utilizadas notas
            de 100, 50, 20, 10, 5 e 2 reais. Dica = lembre-se do operador de resto da divisão de
            inteiros (%). */

        int saque;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre o valor do saque");
        saque = teclado.nextInt();
        System.out.println("Número de cédulas de R$100: "+saque/100);
        saque = saque-saque/100*100;
        System.out.println("Número de cédulas de R$50: "+saque/50);
        saque =  saque%50;
        System.out.println("Número de cédulas de R$20: "+saque/20);
        saque =  saque%20;
        System.out.println("Número de cédulas de R$10: "+saque/10);
        saque =  saque%10;
        System.out.println("Número de cédulas de R$5: "+saque/5);
        saque =  saque%5;
        System.out.println("Número de cédulas de R$2: "+saque/2);
        saque =  saque%2;
        System.out.println("Número de moedas de R$1: "+saque/1);
        
    }
}

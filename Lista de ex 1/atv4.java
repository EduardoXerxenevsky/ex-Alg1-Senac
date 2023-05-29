import java.util.Scanner;
public class atv4 {
    public static void main(String[] args) {
      /*Crie um algoritmo que leia um valor que deve estar entre 1 e 30. Após a leitura,
informar se o valor está ou não dentro da faixa.  */

Scanner teclado = new Scanner(System.in);
int n1;

System.out.println("Digite um número");
n1 = teclado.nextInt();

if(n1>=1 && n1<=30){
    System.out.println("Seu número está entre 1 e 30: "+n1);
} else {
    System.out.println("Seu número não está entre 1 e 30: "+n1);
}
    }
}

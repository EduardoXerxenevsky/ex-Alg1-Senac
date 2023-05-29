import java.util.Scanner;
public class atv5 {
    public static void main(String[] args) {

        /* Crie um algoritmo que leia 3 valores e informe se o 3º valor informado está entre os
2 primeiros */

System.out.println("Verificador de números");

//declarando variaveis

Scanner teclado = new Scanner(System.in);
int n1,n2,n3;

//declaração do usuario

System.out.println("Digite um número");
n1 = teclado.nextInt();
System.out.println("Digite outro número");
n2 = teclado.nextInt();
System.out.println("Digite outro número");
n3 = teclado.nextInt();

//condicionais
if(n3>=n1 && n3<=n2){
    System.out.println("Seu número está dentro de n1 e n2");
}
else if(n3>=n2 && n3<=n1){
    System.out.println("Seu número está dentro de n2 e n1");
}
else{
    System.out.println("Seu número não está entre eles");
}
    }
}
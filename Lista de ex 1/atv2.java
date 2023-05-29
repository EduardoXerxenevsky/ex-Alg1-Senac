import java.util.Scanner;
public class atv2 {
    public static void main(String[] args) {
        //Crie um algoritmo que leia 3 números e informe qual o menor.

        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        System.out.println("Digite o número 1");
        a = teclado.nextInt();
        System.out.println("Digite o número 2");
        b = teclado.nextInt();
        System.out.println("Digite o número 3");
        c = teclado.nextInt();

        if(a==b&&a==c){
            System.out.println("Os números são iguais");
        }
        else if(a<b && a<c){
        System.out.printf("O número 1: (%d) é o menor",a);
    }
        else if(b<a && b<c){
            System.out.printf("O número 2: (%d) é o menor",b);
        }
        else {
            System.out.printf("O número 3: (%d) é o menor",c);
        }
}
}

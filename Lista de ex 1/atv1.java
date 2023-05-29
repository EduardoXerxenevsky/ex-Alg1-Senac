import java.util.Scanner;
public class atv1 {
    public static void main(String[] args) {
        
        //Crie um algoritmo que leia dois números e informe qual deles é o maior. Informe também caso os números sejam iguais.

        System.out.println("Verificador de números");
        Scanner teclado = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite o número 1");
        n1 = teclado.nextInt();
        System.out.println("Digite o número 2");
        n2 = teclado.nextInt();

        if(n1>n2){
            System.out.printf("O primeiro número é o maior: "+ n1);
        }
        else if(n2>n1){
            System.out.printf("O segundo número é o maior: "+ n2);
        }
        else{
            System.out.printf("Os números são iguais");
        }
    }
}

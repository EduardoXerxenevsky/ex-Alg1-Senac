import java.util.Scanner;
public abstract class atv16 {
    public static void main(String[] args) {

        /*Crie um algoritmo que receba um ano e informe se este ano é bissexto ou não. Caso
    não seja um ano bissexto, o algoritmo deverá informar qual o próximo ano bissexto
    depois do ano informado. */

    Scanner teclado = new Scanner(System.in);
    int ano;
    
    System.out.println("Digite um ano para saber se é bissexto");
    ano = teclado.nextInt();
    
    // se o ano for maior que 400
    if(ano % 400 == 0){
        System.out.println(ano + " é bissexto.");
    // se o ano for menor que 400
    } else if((ano % 4 == 0) && (ano % 100 != 0)){
        System.out.println(ano + " é bissexto.");
    } else{
        System.out.println(ano + " não é bissexto");
    }
    }
}

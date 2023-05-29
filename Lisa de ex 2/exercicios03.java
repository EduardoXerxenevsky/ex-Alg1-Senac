import java.util.Scanner;
public class exercicios3 {
    public static void main(String[] args) {
    //declaracao de variavel
    Double salario;
    String nome;
    Scanner teclado = new Scanner(System.in);

    //Imprimindo salario
    System.out.println("Digite seu salario: ");
    salario = teclado.nextDouble();
    System.out.println("Digite seu nome: ");
    nome = teclado.next();
    double salarionovo=salario*0.25 + salario;
    System.out.println("oi "+ nome + " seu aumento é de "+salario*0.25 +" seu novo salario sera: "+ salarionovo );
    
}
}
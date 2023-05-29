import java.util.Scanner;
public class exercicios4 {
    public static void main(String[] args) {
//declaracao de variavel
Double salariobruto;
String nome;
Double salariogratificado;
Scanner teclado = new Scanner(System.in);
Double salariodescontado;
Double salarioliquido ;

//Imprimindo
System.out.println( "Digite seu salario bruto");
salariobruto = teclado.nextDouble();
System.out.println("Digite seu nome");
nome = teclado.next();

//calculando

salariogratificado = salariobruto*0.1 + salariobruto;
salarioliquido = salariogratificado-(salariogratificado*0.15);
//impressao final

System.out.println("oi"+ nome + " seu salario bruto é de " + salariobruto + "seu salario liquido é de "+ salarioliquido);




    }
}
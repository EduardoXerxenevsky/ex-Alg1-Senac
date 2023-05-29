import java.util.Scanner;
public class atv15 {
    public static void main(String[] args) {
        /*Crie um algoritmo que receba dois valores literais, armazene-os em variáveis
distintas e após o armazenamento troque os conteúdos das variáveis. Ao término, o
algoritmo deve mostrar o novo conteúdo de cada variável */

Scanner teclado = new Scanner(System.in);
int x,y,z;
z = 0;
System.out.println("Digite um número para X");
x= teclado.nextInt();
System.out.println("Digite um número para Y");
y= teclado.nextInt();

z = x;
x = y;
y = z;

System.out.println("X é igual a "+x+" e y é igual a "+y);
    }
}
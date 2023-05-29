import java.util.Scanner;
public class exercicio20 {
    public static void main(String[] args) {

        //declarando variaveis e imprimindo-as
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias: ");
        int dias = teclado.nextInt();

        int horas = dias * 24;
        System.out.println(dias + " dias equivalem a " + horas + " horas.");

        int meses = dias / 30;
        System.out.println(dias + " dias equivalem a " + meses + " meses.");

        int trimestres = meses / 3;
        System.out.println(dias + " dias equivalem a " + trimestres + " trimestres.");

        int semestres = meses / 6;
        System.out.println(dias + " dias equivalem a " + semestres + " semestres.");

        int anos = dias / 365;
        System.out.println(dias + " dias equivalem a " + anos + " anos.");

        int decadas = anos / 10;
        System.out.println(dias + " dias equivalem a " + decadas + " décadas.");

    
    }
}
        

import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {

        //declarando variaveis

        double pesoracao,quantidade,resto;
        String gato1,gato2;

        Scanner teclado = new Scanner(System.in);

        //declarando valores e imprimindo

        System.out.println("Informe o peso da raçao (em kg) e a quantidade de raçao fornecida para cada gato em gramas em sequencia");

        pesoracao = teclado.nextDouble();
        quantidade = teclado.nextDouble();
        resto = pesoracao - quantidade*5;



        System.out.println("O gato1 e o gato2 receberá " +quantidade+ " gramas de raçao dividido entre eles");
        System.out.println("A Quantidade de raçao que sobrará no saco após 5 dias é de "+resto);
}
}
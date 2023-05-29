import java.util.Scanner;
public class exercicios5 {
    public static void main(String[] args) {
        //declarando variveis
        double deposito,juros,valorrendimento,valortotal;
        Scanner teclado = new Scanner (System.in);
        //imprimindo
        System.out.println("Digite seu deposito: ");
       deposito = teclado.nextDouble();
        System.out.println("Digite sua taxa seu juros");
        juros = teclado.nextDouble();

        //calculo do rendimento

        valorrendimento = deposito*juros/100;
        valortotal = valorrendimento + deposito;
        System.out.println(valorrendimento);
        System.out.println(valortotal);
        //impressao final
        System.out.println("Seu valor de rendimento é "+ valorrendimento+" e seu valor total é "+ valortotal);




    
}
}
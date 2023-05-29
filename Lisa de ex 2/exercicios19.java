import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args) {

        double segundos,horas,minutos,milissegundos;

        Scanner teclado = new Scanner(System.in);

        //

        System.out.println("Escreva os segundos para transformar em minutos, horas e milissegundos para voce");
        segundos = teclado.nextDouble();

        

        minutos = segundos/60;
        horas = minutos /60;
        milissegundos = segundos*1000;



    
        System.out.println(+minutos+" Minutos");
        System.out.println(+horas+" Horas");
        System.out.println(+milissegundos+" milissegundos");


    


}
}
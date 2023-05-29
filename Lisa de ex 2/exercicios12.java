import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {

        //determinando variavel

        double alturax,altura,objetivo;
     
    Scanner teclado = new Scanner(System.in);

        // imprimindo e declarando valores

        System.out.println("Olá, declara a altura X referente aos degraus, a altura desejada alcançar subindo a escada em sequencia");

        alturax = teclado.nextDouble();
        altura = teclado.nextDouble();
        objetivo = alturax + altura;
            
        System.out.println("Voce deverá subir " +objetivo+ " degraus para alcançar seu objetivo");  
        

}
}
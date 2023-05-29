import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {

        //declarando variavel
       double jarda,pe,milha,polegadas;

        Scanner teclado = new Scanner(System.in);

        
        //imprimindo e declarando valores
        
        System.out.println("Escreva a medida em pe");
        pe = teclado.nextInt();

        polegadas=pe*12;
        jarda = (pe*3);
        milha= (jarda*1760)/3;

        System.out.println("1 pé é = "+polegadas+" Polegadas");
        System.out.println("1 jarda é = "+jarda+" pés");
        System.out.println("1 milha é = "+milha+" Jardas");
        

}
}


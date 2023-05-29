import java.lang.Math;
import java.util.Scanner;
public class exercicios8 {
    public static void main(String[] args) {
    //declaracao de variavel
    int  tabuada;
    Scanner teclado = new Scanner(System.in);

    //impressao da tabela
tabuada = teclado.nextInt();
System.out.println("tabuada do"+ tabuada);
    for(int x = 0; x <= 10; x++){
        
        System.out.println( x+" x " + tabuada+ "="+ x * tabuada);
    
    }
    }}

import java.util.Scanner;
import java.lang.Math;
public class atv12 {
    public static void main(String[] args) {
        
        /*  Crie um algoritmo que mostre o menu de opções a seguir, receba a opção do usuário
            e os dados necessários para executar cada operação.
                            **** Menu de Opções *****
                            1. Somar dois números
                            2. Raiz quadrada de um número
                            3. Elevar um número a uma potência
                            **** Digite a opção desejada **** 
        */

        //Menu
        System.out.println("**** Menu de Opções *****");
        System.out.println("1. Somar dois números");
        System.out.println("2. Raiz quadrada de um número");
        System.out.println("3. Elevar um número a uma potência");
        System.out.println("**** Digite a opção desejada **** ");
        //Declarando variaveis
        int respostausuario;
        double x,y;
        Scanner teclado = new Scanner(System.in);
        //resposta usuario

        respostausuario = teclado.nextInt();

        //condicional

        if(respostausuario==1){
           // soma
           System.out.println("Digte um número para somar");
           x = teclado.nextInt();
           System.out.println("Digte outro número para somar");
           y = teclado.nextInt();
           System.out.println("Seu número é: " +(x+y));
        }
        else if(respostausuario==2){
           // raiz
           System.out.println("Digte um radicando");
           x = teclado.nextInt();
           System.out.println("Seu número é: " +Math.sqrt(x));
        }
        else if(respostausuario==3){
           // potencia
           System.out.println("Digte uma base");
           x = teclado.nextInt();
           System.out.println("Digte um expoente");
           y = teclado.nextInt();
           System.out.println("Seu número é: " +Math.pow(x, y));
        }
        else{
            System.out.println("Resoposta inválida");
        }
    }   
}

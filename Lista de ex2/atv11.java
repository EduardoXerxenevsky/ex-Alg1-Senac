import java.util.Scanner;
public class atv11 {
    public static void main(String[] args) {
        /*Crie um algoritmo que dados três valores X, Y e Z, verifique se eles podem ser os
        comprimentos dos lados de um triângulo e, se forem, verifique se é um triângulo
        equilátero, isósceles ou escaleno. Considere que:
            • O comprimento de cada lado de um triângulo é menor do que a soma dos
            outros dois lados;
            • Chama-se equilátero o triângulo que tem três lados iguais;
            • Chama-se isósceles o triângulo que tem o comprimento de dois lados iguais;
            • Recebe o nome de escaleno o triângulo que tem os três lados diferentes */

            Scanner teclado = new Scanner(System.in);
            int x,y,z;

            System.out.println("Digite um número");
            x = teclado.nextInt();
            System.out.println("Digite outro número");
            y = teclado.nextInt();
            System.out.println("Digite outro número");
            z = teclado.nextInt();

        if(x<=y+z && y<=x+z && z<=x+y){

            if(x==y&&y==z){
                System.out.println("O triângulo é Isóceles");
            }
            else if(x!=y && y!=z && z != x){
                System.out.println("O triângulo é Escaleno");
            }
            else{
                System.out.println("O triângulo é Equilatero");
            }
        }
        else{
            System.out.println("Triângulo invalido");
        }
    }
}

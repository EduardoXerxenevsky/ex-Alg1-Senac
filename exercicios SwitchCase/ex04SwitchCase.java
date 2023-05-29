import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
/*Crie um programa que receba:
• O código de um produto comprado, supondo que a digitação do produto seja
sempre válida, ou seja, um número inteiro entre 1 e 10;
• O peso do produto em quilos;
• O código do país de origem, supondo que a digitação do código seja sempre
válida, ou seja, um número inteiro entre 1 e 3.
Calcule e mostre:
• O peso do produto convertido em gramas
• O preço total do produto comprado
• O valor do imposto, que é cobrado sobre o preço total do produto comprado
• O valor total, preço total do produto mais imposto
 */

 Scanner teclado = new Scanner(System.in);

 int cdgpro, cdgpais;
 double pesokg,pesog,preco=0,precototal,porcentagem=0,imposto,valortotal;

        System.out.println("Digite o código de um país (1 a 3)");
        cdgpais = teclado.nextInt();

        switch(cdgpais){
            case 1:
            porcentagem = 0;
            break;
            case 2:
            porcentagem = 0.15;
            break;
            case 3:
            porcentagem = 0.25;
            break;
            default:
            System.out.println("Códiigo de país inváldo.");
            System.exit(0);
        }
        System.out.println("Digite o código de um produto (1 a 10)");
        cdgpro = teclado.nextInt();
        System.out.println("Digite o peso do produto em KG");
        pesokg = teclado.nextDouble();

        switch(cdgpro){
            case 1:
            case 2:
            case 3:
            case 4:
            preco = 10;
            break;
            case 5:
            case 6:
            case 7:
            preco = 25;
            break;
            case 8:
            case 9:
            case 10:
            preco = 35;
            break;
            default:
            System.out.println("Código de produto inválido.");
            System.exit(0);
        }
        pesog = pesokg * 1000;
        precototal = pesog*preco;
        imposto = porcentagem*precototal;
        valortotal = precototal+imposto;
        System.out.printf("Peso convertdo em gramas: %dg%nPreço Total (Preço em g * peso em g): R$%.2f%nValor do Imposto: R$%.2f%nValor Total R$%.2f",pesog,precototal,imposto,valortotal);
        teclado.close();
    }
}

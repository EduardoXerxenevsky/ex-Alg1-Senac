 import java.util.Scanner;
public class exercicios2 {

  public static void main(String[] args) {
// declaração de variaveis
    double n1,n2,n3,p1,p2,p3,media;
    Scanner teclado = new Scanner(System.in);

    // solicite a digitação das notas
    System.out.println("Digite as 3 notas na sequencia");
    n1 = teclado.nextDouble();
    n2 = teclado.nextDouble();
    n3 = teclado.nextDouble();
      
  // solicite a digitação dos pesos
    System.out.println("Digite as 3 pesos na sequencia");
    p1 = teclado.nextDouble();
    p2 = teclado.nextDouble();
    p3 = teclado.nextDouble();
    // calcule a media
    media = (n1 * p1 + n2 * p2 + n3 * p3)/(p1 + p2 + p3);
    // exibir a media 
    System.out.println("A media ponderada é "+media);
}
}
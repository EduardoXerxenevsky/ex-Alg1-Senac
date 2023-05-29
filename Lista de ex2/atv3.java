import java.util.Scanner;
public class atv3 {
    public static void main(String[] args) {
        /*Crie um algoritmo que leia o nome do aluno, suas 4 notas, calcule a média e
classifique o resultado conforme a tabela abaixo. Ao final, deverão ser exibidos o
nome do aluno, suas 4 notas, sua média e sua classificação.
*/
//declaração de variaveis
Scanner teclado = new Scanner(System.in);
String nome;
double nota1,nota2,nota3,nota4,media;
//declaração do usuario
System.out.println("Digite seu nome: ");
nome = teclado.nextLine();
System.out.println("Digite sua nota 1: ");
nota1 = teclado.nextDouble();
System.out.println("Digite sua nota 2: ");
nota2 = teclado.nextDouble();
System.out.println("Digite sua nota 3: ");
nota3 = teclado.nextDouble();
System.out.println("Digite sua nota 4: ");
nota4 = teclado.nextDouble();

//calculo

media = (nota1+nota2+nota3+nota4)/4;
//condicionais
if(media<=20){
    System.out.println("Olá, "+ nome+ " suas notas são: "+nota1+" ,"+nota2+" ,"+nota3+" ,"+nota4+" sua média é: "+media+" e sua classificação é Péssimo.");
}
else if(media<=40){
    System.out.println("Olá, "+ nome+ " suas notas são: "+nota1+" ,"+nota2+" ,"+nota3+" ,"+nota4+" sua média é: "+media+" e sua classificação é Ruim.");
}
else if(media<=60){
    System.out.println("Olá, "+ nome+ " suas notas são: "+nota1+" ,"+nota2+" ,"+nota3+" ,"+nota4+" sua média é: "+media+" e sua classificação é Regular.");
}
else if(media<=80){
    System.out.println("Olá, "+ nome+ " suas notas são: "+nota1+" ,"+nota2+" ,"+nota3+" ,"+nota4+" sua média é: "+media+" e sua classificação é Bom.");
}
else{
    System.out.println("Olá, "+ nome+ " suas notas são: "+nota1+" ,"+nota2+" ,"+nota3+" ,"+nota4+" sua média é: "+media+" e sua classificação é Ótimo.");
}
    }
}

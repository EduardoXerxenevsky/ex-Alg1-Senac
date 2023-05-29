import java.util.Scanner;
public class Turma {
    public static void main(String[] args) {
        String turma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva sua turma");
        turma = teclado.nextLine();

        switch(turma.toUpperCase()){

            case "A":
            System.out.println("Você é da turma A");
            break;
            case "B":
            System.out.println("Você é da turma B");
            break;
            case "C":
            System.out.println("Você é da turma C");
            break;
            default:
            System.out.println("Não reconheço sua turma.");
        }
        teclado.close();
    }
}

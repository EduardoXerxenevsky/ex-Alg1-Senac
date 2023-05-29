import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        int vetor[] = new int[5];
        String v[] = new String[5];
        vetor[0] = 10;
        vetor[1] = 70;
        vetor[2] = 4;
        vetor[3] = 32;
        vetor[4] = 98;
        v[0] = "sim";
        v[1] = "nao";
        v[2] = "sim";
        v[3] = "nao";
        v[4] = "sim";
        for (int i = 0; i <= 5; i++) {
            System.out.println(vetor[i]);
            System.out.println(v[i]);

        }
        
    }
}

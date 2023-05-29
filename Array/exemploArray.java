import java.util.Scanner;
public class exemploArray {
    public static void main(String[] args) {
      /*  double[] dias = new double[6];
        double total=0, media=0;
        int escolha;
        Scanner sc1 = new Scanner(System.in);
        for(int i = 0;i < 6;i++){
            System.out.println("Informe as vendas do dia "+(i+1));
            dias[i] = sc1.nextDouble();
            total += dias[i];
        }
        do{
        System.out.println("--------------------");
        System.out.println("1. Venda por dia");
        System.out.println("2. Total das vendas");
        System.out.println("3. Média das vendas");
        System.out.println("0. Sair");
        System.out.println("--------------------");
        escolha = sc1.nextInt();
        if(escolha == 1){
        int aux;
        System.out.println("Informe de que dia você deseja consultar");
        aux = sc1.nextInt();
        if(aux <=6){
        System.out.println("As vendas do dia "+aux+" são: "+dias[aux-1]);
        }else{
            System.out.println("Dia inválido");
        }
        }else if(escolha == 2){
            System.out.println("O total dos dias é "+total);
        }else if(escolha == 3){
            media = total/dias.length;
            System.out.println("A média dos dias é: "+media);
        }else if(escolha != 0){
            System.out.println("Tente novamente");
        }
    }while(escolha != 0);
    */

    int nota[] = new int[4];
    String nome[] = new String[4];
    Scanner sc1 = new Scanner(System.in);

    for(int i = 0;i<4;i++){
    System.out.println("Informe o nome do aluno: ");
    nome[i] = sc1.next();
    System.out.println("Informe a nota final do aluno: ");
    nota[i] = sc1.nextInt();
    }
    for(int j=0;j<4;j++){
        System.out.printf("[%s, Nota:%d]",nome[j],nota[j]);
    }
    sc1.close();
}
}

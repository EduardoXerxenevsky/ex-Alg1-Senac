
import java.util.Scanner;
public class exercicio15 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //declarando variaveis
        int dia,diatual,mes,mesatual,ano,anoatual,totaldias;
        int anos, meses, dias, diano, diames,idadeatual;
        
        Scanner teclado = new Scanner(System.in);

        //declarando valores e imprimindo

        System.out.println("Digite o dia que você nasceu:\n");
        dia=teclado.nextInt();
        System.out.println("Digite o mes que você nasceu:\n");
        mes=teclado.nextInt();
        System.out.println("Digite o ano que você nasceu:\n");
        ano=teclado.nextInt();

        System.out.println("Digite o dia (data de hoje):\n");
        diatual=teclado.nextInt();
        System.out.println("Digite o mês (data de hoje):\n");
        mesatual=teclado.nextInt();
        System.out.println("Digite o ano (data de hoje):\n");
        anoatual=teclado.nextInt();

        idadeatual = anoatual - ano;

        //total de anos vividos
        anos=anoatual-ano;
        // diaano é os anos multiplicados por 365 dias, mais os dias dos anos bissextos, obtido pelo resto a divisao por 4
        diano=(anos%4)+(anos*365);
        
        if(mesatual>mes){
        meses=mesatual-mes;
        }
        else {
        meses=mes-mesatual;
        }
        // meses convertido em dias
        diames=meses*30;
        
        if(diatual>dia){
        dias=diatual-dia;
        }
        else {
        dias=dia-diatual;
        }
        totaldias=diames+diano+dias;
        System.out.printf("Voce viveu: "+totaldias+" Dias e tem "+idadeatual+" Anos");
    }
        }
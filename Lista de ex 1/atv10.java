import java.util.Scanner;
public class atv10 {
    public static void main(String[] args) {
        /*
        Você foi solicitado a criar um programa para acompanhamento de peso, no qual
        através do peso e da altura calcula-se o IMC. Após o cálculo, deverá ser informada
        a classificação, conforme tabela abaixo. (IMC = Peso / Altura²)
                    IMC                         Classificação
            Menor ou igual a 16                 Magreza Severa
            Entre 16 e 17                       Magreza Moderada
            Entre 17 e 18.5                     Magreza Leve
            Entre 18.5 e 25                     Normal
            Entre 25 e 30                       Obesidade Leve
            Entre 30 e 40                       Obesidade Severa
            Acima de 40                         Obesidade Mórbida
         */
        System.out.println("CALCULADORA DE IMC");

        //declarando varaveis

        Scanner teclado = new Scanner(System.in);
        double peso,altura,IMC;

        //declaração do usuario

        System.out.println("Digite seu peso em kg");
        peso = teclado.nextDouble();
        System.out.println("Digite sua altura em m");
        altura = teclado.nextDouble();

        //calculo

        IMC = peso/(altura*altura);

        //condicional

    if(IMC<=16){
        System.out.println("Magreza Severa");
    }
    else if(IMC<=17){
        System.out.println("Magreza Moderada");
    }   
    else if(IMC<=18.5){
        System.out.println("Magreza Leve");
    }
    else if(IMC<=25){
        System.out.println("Normal");
    }
    else if(IMC<=30){
        System.out.println("Obesidade Leve");
    }
    else if(IMC<=40){
        System.out.println("Obesidade Severa");
    }
    else{
        System.out.println("Obesidade Moderada");
    }
System.out.println(IMC);
}
}
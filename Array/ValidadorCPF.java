import java.util.Scanner;
public class ValidadorCPF {
    public static void main(String[] args) {
        String cpf;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite seu CPF para ser validado: ");
        cpf = sc1.nextLine();
        cpf= cpf.replace(".","").replace("-","");
        
        if(verificador(cpf)){
            System.err.println("CPF VÁLIDO.");
        }else{
            System.err.println("CPF INVÁLIDO.");
        }
    }
    // método para descobrir o primeiro digito verificador
    public static int calcDv1(String cpf){
        int soma=0, fator=10,dv1;
        for(int i = 0; i<9; i++){
            
            char n = cpf.charAt(i);
            int valor = n - 48;
            soma = fator * valor + soma;
            fator--;
        }
        if(soma%11<2){
            dv1 = 0;
        }else{
            dv1= 11-soma%11;
        }
        return dv1;
    }
    public static int calcDv2(String cpf){
        int soma=0, fator=11,dv2;
        for(int i = 0; i<10; i++){
            
            char n = cpf.charAt(i);
            int valor = n - 48;
            soma = fator * valor + soma;
            fator--;

        }
        if(soma%11<2){
            dv2 = 0;
        }else{
            dv2= 11-soma%11;
        }
        return dv2;
    }
    public static boolean verificador(String cpf){
        int dv1, dv2;
        boolean valido = false;
        // verifica se tem 11 caracters e se não são todos inguais
        if(cpf.length()==11 && !cpf.equals("11111111111") && !cpf.equals("22222222222") && !cpf.equals("33333333333") && !cpf.equals("44444444444") && !cpf.equals("55555555555") && !cpf.equals("66666666666") && !cpf.equals("77777777777") && !cpf.equals("88888888888") && !cpf.equals("99999999999") && !cpf.equals("00000000000")){
            dv1= calcDv1(cpf);
            int dv1Inf = cpf.charAt(9)- 48 ;
            if(dv1 == dv1Inf){
                dv2 = calcDv2(cpf);
                int dv2Inf = cpf.charAt(10)- 48;
                if(dv2==dv2Inf){
                    valido = true;
                }
            }
        }
        return valido;
    }
}

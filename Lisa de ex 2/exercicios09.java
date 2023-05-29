import java.lang.Math;
public class exercicios9 {
    public static void main(String[] args) {
//declaracao de variavel
double a,b,c,delta,x1,x2;

//calculo

a = 1;
b = 5;
c = 6;
delta = Math.pow(b,2)-4*a*c;
x1 = (-b + Math.sqrt(delta))/2*a;
x2 = (-b - Math.sqrt(delta))/2*a;

//impressao final

System.out.println("O valor de x1 é:"+ x1 + "e o valor de x2 é "+ x2);


}
}
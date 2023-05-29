import java.util.Random;
import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex5();
        // ex6();
        // ex7();
        // ex8();
        // ex9();
        // ex10();
        // ex11();
        // ex12();
        // ex13();
        // ex14();
        // ex15();
        // ex16();
        // ex17();
        // ex18();
        // ex19();
        // ex20();
    }

    /*
     * Crie um algoritmo com a função de exibir todos os números que são divisíveis
     * por 3
     * entre 0 e 1000
     */
    public static void ex1() {
        double n = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d é divisivel%n", i);
            }
        }
        System.out.println(n);
    }

    /*
     * Crie um algoritmo que conte de 1 a 250 e em cada múltiplo de 10 exiba a
     * mensagem:
     * “Múltiplo de 10”.
     */
    public static void ex2() {
        for (int i = 1; i <= 250; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " é Múltiplo de 10");
            }
        }
    }

    /*
     * Crie um algoritmo que apresente a soma dos termos da sequência (1 + 2 + 3 + 4
     * +
     * 5 + 6... + 99 + 100).
     */
    public static void ex3() {
        int x = 0;
        for (int i = 1; i <= 100; i++) {
            x = x + i;
        }
        System.err.println(x);
    }

    /*
     * Complemente o algoritmo criado no exercício 3, solicitando ao usuário até
     * qual
     * termo deverá ser exibida a soma
     */
    public static void ex4() {
        Scanner tec = new Scanner(System.in);
        int termo;
        System.out.println("Digite o valor");
        termo = tec.nextInt();
        int x = 0;
        for (int i = 1; i <= termo; i++) {
            x = x + i;
        }
        System.out.println(x);
        tec.close();
    }

    /*
     * Crie um algoritmo que tenha a função de calcular o fatorial de um número
     * digitado
     * pelo usuário. Exemplo: o fatorial de 3 é igual a 3*2*1, fatorial de 5 é igual
     * a 5*4*3*2*1.
     */
    public static void ex5() {
        Scanner tec = new Scanner(System.in);
        int x;
        int fatorial = 1;
        System.out.println("Digite o valor");
        x = tec.nextInt();
        for (int i = 1; i <= x; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
        tec.close();
    }

    /*
     * Crie um algoritmo que tenha a função de efetuar a soma dos 15 primeiros
     * termos da
     * sequência. (5,10,15,20...).
     */
    public static void ex6() {
        int calculo = 0;
        for (int i = 1; i <= 15; i++) {
            calculo = calculo + (i * 5);
        }
        System.out.println(calculo);
    }

    /*
     * Complemente o algoritmo do exercício 6, solicitando o primeiro e o último
     * termo da
     * sequência desejada.
     */
    public static void ex7() {
        Random rand = new Random();
        int x, y;
        x = rand.nextInt(15);
        y = rand.nextInt(15);
        int calculo = 0;
        while (x > y) {
            x = rand.nextInt(15);
            y = rand.nextInt(15);
        }
        for (int i = x; i <= y; i++) {
            calculo = calculo + (i * 5);
        }
        System.out.println(calculo);
        System.out.println("x= " + x + " y= " + y);
    }

    /*
     * Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se
     * que:
     * • Esse funcionário foi contratado em 2010, com salário inicial de R$
     * 1.000,00;
     * • Em 2011, ele recebeu aumento de 1,5% sobre seu salário inicial;
     * • A partir de 2012 (inclusive), os aumentos salariais sempre corresponderam
     * ao
     * dobro do percentual do ano anterior.
     * Crie um algoritmo que determine o salário atual desse funcionário.  
     */
    public static void ex8() {
        int ano = 2010;
        double salarioInicial = 1000, Aumento = 0.015, salarioAtual;
        salarioAtual = (Aumento * salarioInicial) + salarioInicial;
        ano++;
        while (ano < 2023) {
            ano++;
            Aumento = Aumento * 2;
            salarioAtual = salarioAtual * Aumento;
        }
        System.out.println(salarioAtual);
    }

    /*
     * Crie um algoritmo que receba o salário de um funcionário chamado Carlos.
     * Sabe-se
     * que outro funcionário, João, tem salário equivalente a 1/3 do salário de
     * Carlos.
     * Carlos aplicará seu salário integralmente em uma aplicação que está rendendo
     * 2%
     * ao mês e João aplicará seu salário integralmente em um fundo de renda fixa
     * rendendo 5% ao mês. O algoritmo deverá calcular e mostrar a quantidade de
     * meses
     * necessários para que o valor pertencente a João iguale ou ultrapasse o valor
     * pertencente a Carlos.
     *  
     */
    public static void ex9() {
        double salarioCarlos = 1000, salarioJoao, mes = 0;
        salarioJoao = salarioCarlos / 3;
        while (salarioCarlos >= salarioJoao) {
            mes++;
            salarioCarlos = (salarioCarlos * 0.02) + salarioCarlos;
            salarioJoao = (salarioJoao * 0.05) + salarioJoao;
        }
        System.out.println(mes);
    }

    /*
     * Crie um algoritmo que leia valores inteiros diferentes de 0 e exiba as
     * informações
     * abaixo ao ser informado o número 0.
     * a) A soma dos números positivos;
     * b) A quantidade de números negativos
     */
    public static void ex10() {
        Scanner sc1 = new Scanner(System.in);
        int n;
        int somaposi = 0;
        int qtdnega = 0;
        do {
            System.out.println("Digite um valor (se for 0 sai)");
            n = sc1.nextInt();
            if (n > 0) {
                somaposi += n;
            } else if (n < 0) {
                qtdnega++;
            }
        } while (n != 0);
        {
            System.out.println("A soma dos positivos é " + somaposi);
            System.out.println("A quantidade de negativo é " + qtdnega);
        }
        sc1.close();
    }

    /*
     * Escreva um algoritmo que receba a nota de um aluno entre 0 e 10 e informe se
     * ele
     * está aprovado (maior ou igual a 6), de recuperação (entre 5 e 6) ou reprovado
     * (abaixo de 5). Caso o valor informado não esteja entre 0 e 10, o algoritmo
     * deverá
     * solicitar novamente o valor até que esteja no intervalo desejado.
     *  
     */
    public static void ex11() {
        Scanner sc1 = new Scanner(System.in);
        double nota;
        do {
            System.out.println("Qual foi a nota do aluno?");
            nota = sc1.nextInt();
            if (nota < 5) {
                System.out.println("Reprovado");
            } else if (nota < 6) {
                System.out.println("Recuperação");
            } else if (nota <= 10) {
                System.out.println("Aprovado");
            }
        } while (nota > 10);
        sc1.close();
    }

    /*
     * Crie um algoritmo que apresente o menu de opções a seguir, permita ao usuário
     * escolher a opção desejada, receba os dados necessários para executar a
     * operação
     * e mostre o resultado. Verifique a possibilidade de opção inválida e não se
     * preocupe
     * com restrições do tipo salário inválido.
     * ----- Menu de opções -----
     * 1. Imposto
     * 2. Novo salário
     * 3. Classificação
     * 4. Finalizar o programa
     * Digite a opção desejada.
     * -----------------------------------
     * Na opção 1, receber o salário de um funcionário, calcular e mostrar o valor
     * do
     * imposto usando as regras a seguir:
     *         Salários                % do imposto
     * Menor ou igual a R$ 1500,00          5
     * De R$ 1500,01 a R$ 3000,00           10
     * Acima de R$ 3000,00                  15
     * Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor
     * do novo
     * salário usando as regras a seguir:
     * Salários                            Aumento
     * Maiores que R$ 4.500,00             R$ 250,00
     * De R$ 3.000,01 a R$ 4.500,00        R$ 200,00
     * De R$ 2.000,01 a R$ 3.000,00        R$ 150,00
     * Menores que R$ 2.000,01             R$ 130,00
     * Na opção 3, receber o salário de um funcionário e mostrar sua classificação
     * usando
     * esta tabela:
     * Salários                                Classificação
     * Maiores que R$ 3.000,00                 Bem remunerado
     * Até R$ 3.000,00                         Mal remunerado
     */
    public static void ex12() {
        Scanner sc1 = new Scanner(System.in);
        int n = 0;
        double salario = 0;
        do {
            System.out.printf(
                    "----- Menu de opções -----%n1. Imposto%n2. Novo salário%n3. Classificação%n4. Finalizar o programa%nDigite a opção desejada.%n-----------------------------------%n");
            n = sc1.nextInt();
            if (n == 4) {
                break;
            }
            System.out.println("Digite o valor do seu salário");
            salario = sc1.nextDouble();
            if (n == 1) {
                if (salario <= 1500) {
                    salario = salario - (salario * 0.05);
                } else if (salario < 3000) {
                    salario = salario - (salario * 0.10);
                } else {
                    salario = salario - (salario * 0.15);
                }
                System.out.println(salario);
            } else if (n == 2) {
                if (salario < 2000) {
                    salario = salario + 130;
                } else if (salario < 3000) {
                    salario = salario + 150;
                } else if (salario < 4500) {
                    salario = salario + 200;
                } else {
                    salario = salario + 250;
                }
                System.out.println(salario);
            } else if (n == 3) {
                if (salario < 3000.01) {
                    System.out.println("Mal Remunerado");
                } else {
                    System.out.println("Bem Remunerado");
                }
            }
        } while (n != 4);
        sc1.close();
    }

    public static void ex13() {
        Scanner sc1 = new Scanner(System.in);
        double faturamento = 0, referencia = 0, kw = 0, tipo = 0, preco, totalcliente = 0, qtdpquin = 0;
        int cliente = 0;
        System.out.println("Informe o valor de referencia");
        referencia = sc1.nextInt();
        preco = referencia / 8;
        do {
            cliente++;
            System.out.println("Informe o valor do kw");
            kw = sc1.nextInt();
            if (kw == 0) {
                break;
            }
            System.out.println("Informe o tipo do consumidor 1- residencial 2- comercial 3- industrial");
            tipo = sc1.nextInt();
            if (tipo == 1) {
                totalcliente = ((0.05 * (kw * preco)) + kw * preco);
            } else if (tipo == 2) {
                totalcliente = ((0.10 * (kw * preco)) + kw * preco);
            } else if (tipo == 3) {
                totalcliente = ((0.15 * (kw * preco)) + kw * preco);
            }
            if (totalcliente >= 500 && totalcliente <= 1000) {
                qtdpquin++;
            }
            System.out.printf("O cliente %d pagou R$%.2f%n", cliente, totalcliente);
            faturamento = totalcliente + faturamento;
        } while (kw != 0);
        {
            System.out.printf(
                    "O faturamento total da empresa foi de R$%.2f%nA quantidade de clientes que pagaram entre 500 e 1000 foi %.0f%n",
                    faturamento, qtdpquin);
        }
        sc1.close();
    }

    /*
     * Crie um algoritmo que leia o número de termos, determine e mostre os valores
     * de
     * acordo com a série a seguir:
     * Série = 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567
     */
    public static void ex14() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos desejado: ");
        int numeroTermos = scanner.nextInt();

        // Declaração dos primeiros três termos da série
        int t0 = 2;
        int t1 = 7;
        int t2 = 3;

        System.out.print("Série: " + t0 + ", " + t1 + ", " + t2 + ", ");

        for (int i = 3; i <= numeroTermos; i++) {
            t0 *= 2;
            i++;
            System.out.print(t0 + ", ");
            if (i < numeroTermos) {
                t1 *= 3;
                System.out.print(t1 + ", ");
                i++;
                if (i < numeroTermos) {
                    t2 *= 4;
                    System.out.print(t2 + ", ");
                }
            }
        }

        System.out.println();
        scanner.close();
    }

    /*
     * Crie um algoritmo para calcular a tabuada de um número informado, usando
     * estrutura de repetição.
     */
    public static void ex15() {
        Scanner sc1 = new Scanner(System.in);
        int total;
        System.out.println("Digite o numero da tabuada");
        int num = sc1.nextInt();
        for (int i = 0; i <= 10; i++) {
            total = num * i;
            System.out.printf("%d x %d = %d%n", num, i, total);
        }
        sc1.close();
    }

    /* Crie um algoritmo que mostre as tabuadas dos números de 1 a 10 */
    public static void ex16() {
        Scanner sc1 = new Scanner(System.in);
        int total, num;
        do {
            System.out.println("Informe o número da tabuada de 1 a 10");
            num = sc1.nextInt();
            if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("Número informado inválido");
            } else if (num > 10) {
                System.out.println("Número informado inválido");
            } else {
                for (int i = 0; i <= 10; i++) {
                    total = num * i;
                    System.out.printf("%d x %d = %d%n", num, i, total);
                }
            }
        } while (num != 0);
        sc1.close();
    }

    /*
     * Em um campeonato de futebol existem cinco times e cada um possui quinze
     * jogadores. Faça um algoritmo que receba a idade, o peso e a altura de cada um
     * dos
     * jogadores, calcule e mostre:
     * • A quantidade de jogadores com idade inferior a 18 anos;
     * • A média das idades dos jogadores de cada time;
     * • A média das alturas de todos os jogadores do campeonato;
     * • O percentual de jogadores com mais de 80 Kg entre todos os jogadores do
     * campeonato.
     */
    public static void ex17() {
        double menorDezoito = 0, mediaIdade = 0, mediaAltura = 0, perc80 = 0, totalIdade = 0, totalAltura = 0,
                totalMaisOitenta = 0;
        Random rand = new Random();
        double alturaGremio[] = new double[15], alturaSantos[] = new double[15], alturaFluminense[] = new double[15],
                alturaMotoClube[] = new double[15], alturaMirassol[] = new double[15];
        int idadeGremio[] = new int[15], idadeSantos[] = new int[15], idadeFluminense[] = new int[15],
                idadeMotoClube[] = new int[15], idadeMirassol[] = new int[15], pesoGremio[] = new int[15],
                pesoSantos[] = new int[15], pesoFluminense[] = new int[15], pesoMotoClube[] = new int[15],
                pesoMirassol[] = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.println("Informe o peso do jogador " + (i + 1) + " do Grêmio: ");
            pesoGremio[i] = rand.nextInt(101);
            System.out.println("Informe a altura do jogador " + (i + 1) + " do Grêmio: ");
            alturaGremio[i] = rand.nextDouble();
            System.out.println("Informe a idade do jogador " + (i + 1) + " do Grêmio: ");
            idadeGremio[i] = rand.nextInt(35);
            if (idadeGremio[i] < 18) {
                menorDezoito++;
            }
            if (pesoGremio[i] > 80) {
                totalMaisOitenta++;
            }
            totalIdade = totalIdade + idadeGremio[i];
            totalAltura = totalAltura + alturaGremio[i];
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Informe o peso do jogador " + (i + 1) + " do Santos: ");
            pesoSantos[i] = rand.nextInt(101);
            System.out.println("Informe a altura do jogador " + (i + 1) + " do Santos: ");
            alturaSantos[i] = rand.nextDouble();
            System.out.println("Informe a idade do jogador " + (i + 1) + " do Santos: ");
            idadeSantos[i] = rand.nextInt(35);
            if (idadeSantos[i] < 18) {
                menorDezoito++;
            }
            if (pesoSantos[i] > 80) {
                totalMaisOitenta++;
            }
            totalIdade = totalIdade + idadeSantos[i];
            totalAltura = totalAltura + alturaSantos[i];
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Informe o peso do jogador " + (i + 1) + " do Fluminense: ");
            pesoFluminense[i] = rand.nextInt(101);
            System.out.println("Informe a altura do jogador " + (i + 1) + " do Fluminense: ");
            alturaFluminense[i] = rand.nextDouble();
            System.out.println("Informe a idade do jogador " + (i + 1) + " do Fluminense: ");
            idadeFluminense[i] = rand.nextInt(35);
            if (idadeFluminense[i] < 18) {
                menorDezoito++;
            }
            if (pesoFluminense[i] > 80) {
                totalMaisOitenta++;
            }
            totalIdade = totalIdade + idadeFluminense[i];
            totalAltura = totalAltura + alturaFluminense[i];
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Informe o peso do jogador " + (i + 1) + " do Moto Clube: ");
            pesoMotoClube[i] = rand.nextInt(101);
            System.out.println("Informe a altura do jogador " + (i + 1) + " do Moto Clube: ");
            alturaMotoClube[i] = rand.nextDouble();
            System.out.println("Informe a idade do jogador " + (i + 1) + " do Moto Clube: ");
            idadeMotoClube[i] = rand.nextInt(35);
            if (idadeMotoClube[i] < 18) {
                menorDezoito++;
            }
            if (pesoMotoClube[i] > 80) {
                totalMaisOitenta++;
            }
            totalIdade = totalIdade + idadeMotoClube[i];
            totalAltura = totalAltura + alturaMotoClube[i];
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Informe o peso do jogador " + (i + 1) + " do Mirassol: ");
            pesoMirassol[i] = rand.nextInt(101);
            System.out.println("Informe a altura do jogador " + (i + 1) + " do Mirassol: ");
            alturaMirassol[i] = rand.nextDouble();
            System.out.println("Informe a idade do jogador " + (i + 1) + " do Mirassol: ");
            idadeMirassol[i] = rand.nextInt(35);
            if (idadeMirassol[i] < 18) {
                menorDezoito++;
            }
            if (pesoMirassol[i] > 80) {
                totalMaisOitenta++;
            }
            totalIdade = totalIdade + idadeMirassol[i];
            totalAltura = totalAltura + alturaMirassol[i];
        }
        mediaAltura = totalAltura / 75;
        mediaIdade = totalIdade / 75;
        perc80 = (totalMaisOitenta / 75) * 100;
        System.out.printf(
                "Dentre os 75 jogadores %.0f são menores de 18%nA média de altura entre os jogaores é de %.0f%nA média de idade é de %.0f%nO percentual de jogadores acima de 80KG é %.0f porcento",
                menorDezoito, mediaAltura, mediaIdade, perc80);
        // IMPORTANTE
        // ele não ta contando a média de altura dos jogadores pq o rand.nextDouble não
        // está puxando numeros muito pequenos e não me deixa setar uma bound para ele,
        // se mudar o Random para Scanner vai funcionar normalmente só precisa de
        // paciencia para escrever todos os 75 valores
    }

    /*
     * Elabore um algoritmo que leia um número positivo de três dígitos e gere outro
     * número formado pelos dígitos com suas posições invertidas em relação ao
     * número
     * informado. Ex.: número informado: 123 / número invertido: 321. Dica: operador
     * de
     * resto da divisão
     */
    public static void ex18() {
        Scanner sc1 = new Scanner(System.in);
        int num;
        do {
            System.out.println("Escreva um numero positivo com três digitos (0 para sair)");
            num = sc1.nextInt();
            if (num < 100) {
                System.out.println("Número inválido");
                break;
            } else if (num > 999) {
                System.out.println("Número inválido");
                break;
            }
            System.out.println("Seu resultado é " + (num % 10) + (num / 10 % 10) + (num / 10 / 10));
        } while (num != 0);
        sc1.close();
    }

    /*
     * Elaborar um algoritmo que efetue a leitura de valores positivos inteiros até
     * que um
     * valor negativo seja informado. Ao final devem ser apresentados o maior e o
     * menor
     * valor informados pelo usuário.
     */
    public static void ex19() {
        int numero = 0, maior = 0, menor = 999999999;
        Scanner sc1 = new Scanner(System.in);
        do {
            System.out.println("Informe um numero (negativo para sair)");
            numero = sc1.nextInt();
            if (numero < 0) {
                break;
            } else if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        } while (numero >= -1);
        System.out.printf("Maior: %d%nMenor: %d", maior, menor);
        sc1.close();
    }

    /*
     * Elabore um algoritmo que leia 15 valores informados via teclado, e apresente
     * na
     * tela:
     * a) O menor número digitado
     * b) O maior número digitado
     * c) A média dos números digitados
     * d) Quantidade de números pares
     * e) Quantidade de números divisíveis por 5
     */
    public static void ex20() {
        int maior = 0, menor = 999999999, par = 0, div5 = 0, n, total = 0;
        double media;
        Random rand = new Random();
        for (int i = 1; i <= 15; i++) {
            n = rand.nextInt(101);
            if (n < menor) {
                menor = n;
            }
            if (n > maior) {
                maior = n;
            }
            total = total + n;
            if (n % 2 == 0) {
                par++;
            }
            if (n % 5 == 0) {
                div5++;
            }
        }
        media = total / 15;
        System.out.printf(
                "Menor: %d%nMaior: %d%nMédia: %.2f%nQuantidade de pares: %d%nQuantidade de divisíveis por 5: %d", menor,
                maior, media, par, div5);
    }
}
/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcula e escreve:
        a. a maior e a menor altura do grupo;
        b. média de altura dos homens;
        c. o número de mulheres.*/

import java.util.Scanner;

public class Ex2 {
    public static class HomensMulheres {
        public static void main(String[] args) {
            int sexo, qtMulheres=0, qtHomens=0;
            float altura, somaH=0, MediaHomens=0, maior=0, menor=0;

            Scanner entrada = new Scanner(System.in);

            for (int i=0; i<10; i++) {
                System.out.println("Escolha o sexo da pessoa (1-Mulher, 2-Homen): ");
                sexo = entrada.nextInt();
            System.out.println("Digite a Altura: ");
            altura = entrada.nextFloat();
            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            }else {
                System.out.println("Opção sexo Inválido!");
            }
            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }

            }
            float mediaHomens = somaH / qtHomens;

            System.out.println("A maior altura do grupo é de " + maior + "m, e a menor é de " + menor + "m");
            System.out.println("A media Altura dos Homens é " + mediaHomens + "m");
            System.out.println("O número de Mulheres é " + qtMulheres);

            entrada.close();
        }
    }
}

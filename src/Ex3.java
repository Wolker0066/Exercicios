/*Criar um programa que calcule a média
        de atraso de uma empresa, exigindo
        ao usuário uma nota de funcionários e os atrasos, e devolvendo a média salarial.*/

public class Ex3 {
    public static class MediaSalario {
        public static void main(String[] args) {
            double n1, n2, n3, n4, media;

            n1 = 3453.21;
            n2 = 3498.43;
            n3 = 7902.09;
            n4 = 12932.00;

            media = (n1 + n2 + n3 + n4) / 4;
            System.out.println("A média salarial da empresa é de R$ " + media);
        }
    }

}
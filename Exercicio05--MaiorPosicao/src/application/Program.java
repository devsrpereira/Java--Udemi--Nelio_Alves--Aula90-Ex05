package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.printf("%nQuantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double maior = 0;
        int position = 0;


        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            maior = vect[i] > maior ? vect[i] : maior;
            position = vect[i] == maior ? i : position;
        }

        System.out.printf("%nMAIOR VALOR = %.1f",maior);
        System.out.printf("%nPOSIÇAO DO MAIOR VALOR = %d%n",position);


        sc.close();
    }
}
